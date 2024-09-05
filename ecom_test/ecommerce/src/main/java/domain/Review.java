package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Review {
    private Long reviewId;
    private int star;
    private String contents;
    private String date;
    private Long memberId;
    private Long itemId;
    //member_id, item_id 외래키

    public static Review of(Long reviewId, int star, String contents){
        return new Review(reviewId,star,contents,null,null,null);
    }

    public static Review of(int star, String contents,Long memberId, Long itemId){
        return new Review(null,star,contents,null,memberId,itemId);
    }


}
