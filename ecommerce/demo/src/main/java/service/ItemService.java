package service;

import domain.Item;
import repository.ItemRepository;

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

        Item item = new Item(name, price);

        try {
            itemRepository.save(item);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
