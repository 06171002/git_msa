package com.lsj.ex10.freeboard;


import com.lsj.ex10.error.BizException;
import com.lsj.ex10.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<FreeBoard> save(@RequestBody FreeBoardReqDto freeBoardReqDto) {

        FreeBoard freeBoard = modelMapper.map(freeBoardReqDto,FreeBoard.class);

        freeBoardRepository.save(freeBoard);

        return ResponseEntity.status(200).body(freeBoard);

    }

    @GetMapping("view/{id}")
    public ResponseEntity<FreeBoardResponseDto> findOne(@PathVariable(name = "id") Long id) {

        FreeBoard freeBoard = freeBoardRepository.findById(id).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

        FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

        return ResponseEntity.ok(freeBoardResponseDto);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id) {
        freeBoardRepository.findById(id).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

        freeBoardRepository.deleteById(id);

        return ResponseEntity.ok("delete");
    }
}

