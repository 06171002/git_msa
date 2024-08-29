package domain;

import lombok.Getter;

@Getter

public class CartItem {

    private Long cartItemId;
    private Long totalPrice;
    private int count;
    private Long cartId;
    private Long itemId;
    // cartId,itemId FK

    public CartItem(Long totalPrice, int count, Long cartId, Long itemId) {
        this.totalPrice = totalPrice;
        this.count = count;
        this.cartId = cartId;
        this.itemId = itemId;
    }
}
