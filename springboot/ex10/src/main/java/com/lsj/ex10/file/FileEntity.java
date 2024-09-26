package com.lsj.ex10.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lsj.ex10.freeboard.FreeBoard;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "freeBoardFiles")
public class FileEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String path;
    private String fileDesc;

    @ManyToOne
    @JsonIgnore
    private FreeBoard freeBoard;

    @Override
    public String toString() {
        return "FileEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", fileDesc='" + fileDesc +
                '}';
    }
}
