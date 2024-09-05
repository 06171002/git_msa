package service;

import common.Session;
import domain.Member;
import domain.Order;
import repository.*;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class OrderService {
    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ItemRepository itemRepository;
    private final OrderItemRepository orderItemRepository;

//    public OrderService() {}

    public OrderService(OrderRepository orderRepository, MemberRepository memberRepository, CartRepository cartRepository, CartItemRepository cartItemRepository, ItemRepository itemRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.memberRepository = memberRepository;
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.itemRepository = itemRepository;
        this.orderItemRepository = orderItemRepository;
    }

//    OrderRepository orderRepository = new OrderRepository();

    public void handleOrderService(Scanner sc) throws SQLException {
        // 상품 조회 -> 장바구니 -> 주문 생성
        // 본인 주문 조회
        // 주문 취소

        // 전체 주문 조회
        // 주문 상태 변경
        while (true){
            Member currentMember = Session.getInstance().getCurrentMember();
            displayOrderMenu();
            int cho = sc.nextInt();
            switch (cho) {
                case 1:
                    if (isAdmin(currentMember)) {
                        allOrderSelect();
                    }else {
                        itemSelect();
                    }

                case 2:
                    if (isAdmin(currentMember)){
                        changeOrderStatus(sc);
                    }else {
                        findOrders();
                    }

                case 3:
                    if (!isAdmin(currentMember)){
                        System.out.println("삭제할 주문 번호");
                        Long id = sc.nextLong();
                        Order order = orderRepository.findById(id).orElse(null);
                        if (order == null) {
                            System.out.println("그런 주문은 없습니다.");
                        } else {
                          if (Objects.equals(order.getMemberId(), Session.getInstance().getCurrentMember().getMemberId())) {
                              orderRepository.deleteById(id);
                          } else {
                              System.out.println("님이 주문한게 아닙니다.");
                          }
                        }
                    }

            }
        }
    }

    private static boolean isAdmin(Member currentMember) {
        return currentMember.getUsername().equals("admin");
    }

    private void findOrders() {
        orderItemRepository.findByUsername();
    }

    private void changeOrderStatus(Scanner sc) throws SQLException {
        System.out.println("변경할 ID");
        Long id = sc.nextLong();
        System.out.println("변경할 상태");
        String status = sc.next();
        orderRepository.updateById(status,id);
    }

    private void itemSelect() throws SQLException {
        itemRepository.findAll();
    }

    private void allOrderSelect() throws SQLException {
        orderRepository.findAll();
    }

    private void displayOrderMenu() {
        Member currentMember = Session.getInstance().getCurrentMember();
        if (currentMember != null) {
            if (isAdmin(currentMember)) {
                System.out.println("""
                        1.전체 주문 조회
                        2.주문 상태 변경
                        """);

            } else {
                System.out.println("""
                        1. 상품 검색 후 주문
                        2. 본인 주문 조회
                        3. 주문 취소
                        """);
            }
        } else {
            System.out.println("로그인 안됨");
        }

    }


}
