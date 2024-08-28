package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Review {


    private long id;
    private int star;
    private String contents;
    private Date date;
    //member_id, item_id 외래키




}
