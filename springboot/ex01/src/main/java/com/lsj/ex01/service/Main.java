package com.lsj.ex01.service;

import com.lsj.ex01.domain.Member;
import com.lsj.ex01.repository.MemberRepository;
import com.lsj.ex01.repository.TodoRepository;
import com.lsj.ex01.service.Main.*;



import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    private MemberRepository memberRepository = new MemberRepository();
//    private TodoRepository todoRepository = new TodoRepository();

    private MemberRepository memberRepository;
    private TodoRepository todoRepository;

    //다른 코드
    //Main main = new Main(new MemberRepository(), new TodoRepository());
    public Main(MemberRepository memberRepository, TodoRepository todoRepository) {
        this.memberRepository = memberRepository;
        this.todoRepository = todoRepository;
    }

    private String info = """
                    뭐할래?
                    0. 로그인
                    1. member select()
                    2. member insert()
                    3. member update()
                    4. member delete()
                    5. todo select()
                    6. todo insert()
                    7. todo update()
                    8. todo delete()
                    """;

    public static Member member;

    public Main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(info);
            int ra = sc.nextInt();
            if (ra == 0){
                // select * from member where id = ?
                // 사용자가 있으면 id 지정

                System.out.println("어떤 사용자 할래?");
                int id = sc.nextInt();
                member = memberRepository.findById(id);
                if (member == null){
                    System.out.println("로그인 실패");
                } else {
                    System.out.println("로그인 성공");
                }
                System.out.println(Main.member); //특정 멤버 아이디로 select
            } else if (ra == 1) {
                memberRepository.select();
            } else if (ra == 2) {
//                memberRepository.insert();
            } else if (ra == 3) {
                memberRepository.update();
            } else if (ra == 4) {
                System.out.println("삭제할 ID");
                int id = sc.nextInt();
                memberRepository.deleteById(id);
            } else if (ra == 5) {
                todoRepository.select();
            } else if (ra == 6) {
                 todoRepository.insert();
            } else if (ra == 7) {
                todoRepository.update();
            } else if (ra == 8) {
                System.out.println("삭제할 ID");
                int id = sc.nextInt();
                todoRepository.delete(id);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}