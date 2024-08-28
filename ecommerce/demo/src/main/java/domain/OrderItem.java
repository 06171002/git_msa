package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderItem {

    private long id;
    private int quantity;
    private int price;
    // orderId,itemId FK
}
