package com.green.orderservice.order.vo;

import com.green.orderservice.order.jpa.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderResponse {

    private String email;
    private String name;

    public static OrderResponse from(OrderEntity entity){
        return new OrderResponse(entity.getEmail(), entity.getName());
    }
}
