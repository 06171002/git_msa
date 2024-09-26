package com.lsj.ex10.freeboard;


import com.lsj.ex10.error.BizException;
import com.lsj.ex10.error.ErrorCode;
import com.lsj.ex10.file.FileEntity;
import com.lsj.ex10.file.FileRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;
    private final ModelMapper modelMapper;
    private final FileRepository fileRepository;

    @Value("${my.value}")
    private String welcome;

    @GetMapping("test")
    public String test() {
        return welcome;
    }


    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findAll(@RequestParam(name = "pageNum",defaultValue = "0") int pageNum,
                                                            @RequestParam(name = "size", defaultValue = "5") int size) {

        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        Pageable pageable = PageRequest.of(pageNum, size,sort);
        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);

        FreeBoardResponsePageDto freeBoardResponsePageDto = modelMapper
                .map(page, FreeBoardResponsePageDto.class);

        List<FreeBoardResponseDto> list = new ArrayList<>();
        for (FreeBoard freeBoard : freeBoardResponsePageDto.getContent()) {
            FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
            freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

            list.add(freeBoardResponseDto);
        }
        freeBoardResponsePageDto.setList(list);

        return ResponseEntity.ok(freeBoardResponsePageDto);
    }



    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<FreeBoard> save(@Valid @RequestPart(name = "data") FreeBoardReqDto freeBoardReqDto, @RequestPart(name = "file", required = false) MultipartFile file) {

        if (file != null){
            String myFilePath = Paths.get("ex10/images/file/").toAbsolutePath() + "/" + file.getOriginalFilename();
            try {
                File destFile = new File(myFilePath);
                file.transferTo(destFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        FreeBoard freeBoard = modelMapper.map(freeBoardReqDto,FreeBoard.class);

        freeBoardRepository.save(freeBoard);

        FileEntity fileEntity = new FileEntity();
        fileEntity.setName(file.getOriginalFilename());
        fileEntity.setPath(Paths.get("ex10/images/file/").toAbsolutePath().toString());
        fileEntity.setFreeBoard(freeBoard);
        fileRepository.save(fileEntity);

        return ResponseEntity.status(200).body(freeBoard);

    }

    @GetMapping("view/{id}")
    public ResponseEntity<FreeBoardResponseDto> findOne(@PathVariable(name = "id") Long id) {

        FreeBoard freeBoard = freeBoardRepository.findById(id).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

        FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

        System.out.println(freeBoard.getList());

        return ResponseEntity.ok(freeBoardResponseDto);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id) {
        freeBoardRepository.findById(id).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

        freeBoardRepository.deleteById(id);

        return ResponseEntity.ok("delete");
    }
}

