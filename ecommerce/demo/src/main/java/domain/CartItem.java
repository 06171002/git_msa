package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CartItem {

    private long cartItemID;
    private long totalPrice;
    private int count;
    // cartId,itemId FK
}
