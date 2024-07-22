package org.example;

import lombok.ToString;
import org.example.friend.ComFriend;
import org.example.friend.Friend;
import org.example.friend.UniFriend;

import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {

        Friend[] friend = new Friend[10];

        friend[0] = new UniFriend("홍길동","010-1234-1234","컴퓨터");
        friend[1] = new ComFriend("회사친구", "전화번호","개발팀");

        System.out.println(Arrays.toString(friend));
    }
}
