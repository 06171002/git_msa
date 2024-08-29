package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Review {

    private long id;
    private int star;
    private String contents;
    private String date;
    //member_id, item_id 외래키

    public Review(int star, String contents, String date) {
        this.star = star;
        this.contents = contents;
        this.date = date;
    }
}
