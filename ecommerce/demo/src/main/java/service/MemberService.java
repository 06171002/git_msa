package service;

import common.Role;
import domain.Item;
import domain.Member;
import repository.impl.ItemRepository;
import repository.impl.MemberRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void createItem() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String birth = sc.next();
        String phone = sc.next();
        String email = sc.next();
        String address = sc.next();
        String loginId = sc.next();
        String password = sc.next();
        String home = sc.next();
        String role = sc.next();


        Member member = new Member(name, birth,phone,email,address,loginId,password,home,role);

        try {
            memberRepository.save(member);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateItem() {
        Scanner sc = new Scanner(System.in);
        long id = sc.nextLong();
        String name = sc.next();
        String birth = sc.next();
        String phone = sc.next();
        String email = sc.next();
        String address = sc.next();
        String loginId = sc.next();
        String password = sc.next();
        String home = sc.next();
        String role = sc.next();

        Member member = new Member(name,birth,phone,email,address,loginId,password,home,role);

        try{
            memberRepository.updateById(member, (long) id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
