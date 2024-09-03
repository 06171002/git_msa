package service;

import domain.Orders;
import repository.impl.OrderRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class
Orderservice {

    private final OrderRepository orderRepository;

    public Orderservice(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public void createOrders() {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        int totalPrice = sc.nextInt();
        String status = sc.next();
        Long member_id = sc.nextLong();

        Orders orders = new Orders(date,totalPrice,status,member_id);

        try {
            orderRepository.save(orders);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void seletAll() {
        try{
            orderRepository.findAll();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void selectById() {
        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        try {
            orderRepository.findById(id);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateItem() {
        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        String date = sc.next();
        int totalPrice = sc.nextInt();
        String status = sc.next();
        Long member_id = sc.nextLong();

        Orders orders = new Orders(date,totalPrice,status,member_id);

        try{
            orderRepository.updateById(orders, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById() {
        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        try {
            orderRepository.deleteById(id);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
