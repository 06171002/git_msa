package com.lsj.ex10.freeboard;

import com.lsj.ex10.user.User;
import lombok.Data;


@Data
public class FreeBoardResponseDto {

    private Long id;

    private String title;
    private String content;


    private User user;

    private String author;

    private String modAuthor;

    private String regDate;

    private String modDate;

    private int viewCount;
}
