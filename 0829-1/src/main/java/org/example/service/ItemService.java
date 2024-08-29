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
    public void service() {
        int i;
        while (true) {
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            if (i == 0) {

                createItem();
            } else if (i == 1) {

            }

        }
    }

    public void createItem() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int price = sc.nextInt();
        String manufact_date = sc.next();
        String origin = sc.next();
        String company = sc.next();
        String size = sc.next();
        String color = sc.next();

        Item item = new Item(name, price,manufact_date,origin,company,size,color);

        try {
            itemRepository.save(item);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
