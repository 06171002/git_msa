package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {

    private long id;
    private String date;
    private int totalPrice;
    private String status;
    //member_id FK

    public Order(String date, int totalPrice, String status) {
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
    }
}
