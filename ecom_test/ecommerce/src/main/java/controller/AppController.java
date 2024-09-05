package controller;

import config.AppConfig;
import service.ItemService;
import service.MemberService;
import service.OrderService;

import java.sql.SQLException;
import java.util.Scanner;

public class AppController {

    AppConfig appConfig = new AppConfig();
    OrderService orderService = appConfig.OrderService();
    MemberService memberService = appConfig.MemberService();
    ItemService itemService = appConfig.ItemService();

    public void run() throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            dispatch(choice,sc);
        }
    }

    private void displayMenu() {
        System.out.println("\n===== Welcome to 쿠팡 =====");
        System.out.println("1. 회원 관련 서비스");
        System.out.println("2. 주문 관련 서비스");
        System.out.println("3. 상품 관련 서비스");
        System.out.println("0. 종료");
        System.out.println("메뉴를 선택하세요.");
    }

    private void dispatch(int choice, Scanner sc) throws SQLException {
        switch (choice){
            case 1:
                memberService.handleMemberService(sc);
            case 2 :
                itemService.handleItemService(sc);
            case 3 :
                orderService.handleOrderService(sc);
            case 0:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
