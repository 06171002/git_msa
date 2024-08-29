package org.example.service;


import org.example.domain.Item;
import org.example.repository.ItemRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class ItemService {

    private final ItemRepository itemRepository = new ItemRepository();

//    public ItemService(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }
    public void service() throws SQLException {
        System.out.println("""
                1. 상품 생성
                2. 상품 조회
                3. 상품 삭제
                """);
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        while (true) {
            if (i == 1) {
                createItem();
            } else if (i == 2) {
                itemRepository.findAll();
            } else if (i == 3) {
                System.out.println("삭제할 ID");
                int d = sc.nextInt();
                itemRepository.deleteById((long) d);
            }
        }
    }

    public void createItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("name :");
        String name = sc.next();
        System.out.println("price");
        int price = sc.nextInt();
        System.out.println("date");
        String manufact_date = sc.next();
        System.out.println("origin");
        String origin = sc.next();
        System.out.println("company");
        String company = sc.next();
        System.out.println("size");
        String size = sc.next();
        System.out.println("color");
        String color = sc.next();

        Item item = new Item(name, price,manufact_date,origin,company,size,color);

        try {
            itemRepository.save(item);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
