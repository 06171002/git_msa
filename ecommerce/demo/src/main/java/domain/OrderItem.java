package domain;

import lombok.Getter;

@Getter

public class OrderItem {

    private Long id;
    private int quantity;
    private int price;
    private Long orderId;
    private Long itemId;
    // orderId,itemId FK

    public OrderItem(int quantity, int price, Long orderId, Long itemId) {
        this.quantity = quantity;
        this.price = price;
        this.orderId = orderId;
        this.itemId = itemId;
    }
}
