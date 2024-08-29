package domain;

import lombok.Getter;

@Getter
public class Order {

    private Long id;
    private String date;
    private int totalPrice;
    private String status;
    private Long member_id;
    //member_id FK

    public Order(String date, int totalPrice, String status, Long member_id) {
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
        this.member_id = member_id;
    }
}
