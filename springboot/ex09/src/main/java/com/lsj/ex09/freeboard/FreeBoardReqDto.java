package com.lsj.ex09.freeboard;

import com.lsj.ex09.user.User;
import lombok.Data;


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
