package org.example.domain;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter @Setter
public class Item {

    private long id;
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

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDateOfMenufac() {
        return dateOfMenufac;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCompany() {
        return company;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
