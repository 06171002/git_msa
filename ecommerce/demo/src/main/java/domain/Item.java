package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Item {

    private long id;
    private String name;
    private int price;
    private String dateOfMenufac;
    private String origin;
    private String company;
    private String size;
    private String color;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
