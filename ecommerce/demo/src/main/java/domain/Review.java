package domain;

import lombok.Getter;

@Getter
public class Review {

    private Long id;
    private int star;
    private String contents;
    private String date;
    private Long member_id;
    private Long item_id;
    //member_id, item_id 외래키

    public Review(int star, String contents, String date, Long member_id, Long item_id) {
        this.star = star;
        this.contents = contents;
        this.date = date;
        this.member_id = member_id;
        this.item_id = item_id;
    }
}
