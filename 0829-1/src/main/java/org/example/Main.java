package org.example;

import org.example.service.ItemService;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("상품 서비스");

        ItemService itemService = new ItemService();
        itemService.service();
    }
}