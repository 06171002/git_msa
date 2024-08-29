package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {

    private long id;
    private int quantity;
    private int price;
    // orderId,itemId FK

    public OrderItem(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }
}
