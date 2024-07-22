package org.example;

import lombok.ToString;
import org.example.friend.ComFriend;
import org.example.friend.UniFriend;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {

        int ucnt = 0;
        int ccnt = 0;

        UniFriend[] uniFriend = new UniFriend[10];
        ComFriend[] comFriends = new ComFriend[10];

        uniFriend[ucnt++] = new UniFriend("홍길동","010-1111-1111","ㅎㅎ");

        System.out.println(Arrays.toString(uniFriend));
        System.out.println(Arrays.toString(comFriends));

        for (int i = 0; i < ucnt; i++) {
            uniFriend[i].showInfo();
        }

        for (int i = 0; i < ccnt; i++) {
            comFriends[i].showInfo();
        }
    }
}
