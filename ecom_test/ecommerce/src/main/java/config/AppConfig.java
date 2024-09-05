package config;

import repository.*;
import service.ItemService;
import service.MemberService;
import service.OrderService;

public class AppConfig {

//    public PasswordEncoder passwordEncoder()

    public OrderService OrderService() {
        return new OrderService(
                new OrderRepository(),
                new MemberRepository(),
                new CartRepository(),
                new CartItemRepository(),
                new ItemRepository(),
                new OrderItemRepository());
    }

    public MemberService MemberService() {
        return new MemberService(new MemberRepository());
    }

    public ItemService ItemService() {
        return new ItemService(new ItemRepository(), new CategoryRepository(), new CategoryItemRepository(), new ReviewRepository());
    }
}
