package domain;

import common.OrderStatus;

public class Order {
    private Long orderId;
    private String date;
    private int totalPrice;
    private OrderStatus status;
    private Long memberId;
    //member_id FK

    public Order(String date, int totalPrice, OrderStatus status, Long memberId) {
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
        this.memberId = memberId;
    }

    public String getDate() {
        return date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Long getMemberId() {
        return memberId;
    }
}
