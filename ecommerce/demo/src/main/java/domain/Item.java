package domain;

import lombok.Getter;

@Getter
public class Item {

    private Long id;
    private String name;
    private int price;
    private String dateOfMenufac;
    private String origin;
    private String company;
    private String size;
    private String color;

    public Item(String name, int price, String dateOfMenufac, String origin, String company, String size, String color) {
        this.name = name;
        this.price = price;
        this.dateOfMenufac = dateOfMenufac;
        this.origin = origin;
        this.company = company;
        this.size = size;
        this.color = color;
    }
}
