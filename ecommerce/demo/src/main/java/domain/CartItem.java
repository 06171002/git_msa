package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {

    private long cartItemId;
    private long totalPrice;
    private int count;
    // cartId,itemId FK

    public CartItem(long totalPrice, int count) {
        this.totalPrice = totalPrice;
        this.count = count;
    }
}
