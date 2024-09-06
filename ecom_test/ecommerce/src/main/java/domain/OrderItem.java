package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderItem {
    private Long orderItemId;
    private int quantity;
    private int price;
    private Long orderId;
    private Long itemId;
    // orderId,itemId FK

}
