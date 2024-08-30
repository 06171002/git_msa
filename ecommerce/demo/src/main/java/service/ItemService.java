package service;

import domain.Item;
import repository.impl.ItemRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
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

    public void updateItem() {
        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        String name = sc.next();
        int price = sc.nextInt();
        String manufact_date = sc.next();
        String origin = sc.next();
        String company = sc.next();
        String size = sc.next();
        String color = sc.next();

        Item item = new Item(name, price,manufact_date,origin,company,size,color);

        try{
            itemRepository.updateById(item, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
