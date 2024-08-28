package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Order {

    private long id;
    private Date date;
    private int totalPrice;
    private String status;
    //member_id FK
}
