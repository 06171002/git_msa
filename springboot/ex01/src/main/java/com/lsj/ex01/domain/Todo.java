package com.lsj.ex01.domain;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@NoArgsConstructor
public class Todo {

    private int id;
    private LocalDateTime dodate;
    private String content;
    private int member_id;

    public Todo(int id, LocalDateTime dodate, String content, int member_id) {
        this.id = id;
        this.dodate = dodate;
        this.content = content;
        this.member_id = member_id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", dodate=" + dodate +
                ", content='" + content + '\'' +
                ", member_id=" + member_id +
                '}';
    }
}
