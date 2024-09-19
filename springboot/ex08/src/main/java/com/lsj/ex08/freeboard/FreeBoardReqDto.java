package com.lsj.ex08.freeboard;

import com.lsj.ex08.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {


    private Long id;
    private String title;
    private String content;
    private User user;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int viewCount;
}
