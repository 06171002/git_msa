package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] chars = new char[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int v =(int) (Math.random() * 2);
                if(v==0){
                    chars[i][j] = 'B';
                }else {
                    chars[i][j] = 'W';
                }
            }
        }
        
        Main main = new Main();
        char[][] test1 = main.doA();
        char[][] test2 = main.doB();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        for (int i = 0; i < N - 8; i++) {
            for (int j = 0; j < M - 8; j++) {
                for (int k = i; k < i+8; k++) {
                    for (int l = 0; l < j+8; l++) {
                        if ()
                    }
                }
            }
        }
    }

//    public char[][] board() {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        char[][] chars = new char[N][M];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                int v =(int) (Math.random() * 2);
//                if(v==0){
//                    chars[i][j] = 'B';
//                }else {
//                    chars[i][j] = 'W';
//                }
//            }
//        }
//        return chars;
//    }

    public char[][] doA(){
        char[][] chars = new char[8][8];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i%2 == 0 && j%2 == 0){
                    chars[i][j] = 'B';
                } else if (i%2 == 0 && j%2 == 1) {
                    chars[i][j] = 'W';
                } else if (i % 2 == 1 && j % 2 == 0) {
                    chars[i][j] = 'W';
                }else {
                    chars[i][j] = 'B';
                }
            }
        }
        return chars;
    }

    public char[][] doB(){
        char[][] chars = new char[8][8];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i%2 == 0 && j%2 == 0){
                    chars[i][j] = 'W';
                } else if (i%2 == 0 && j%2 == 1) {
                    chars[i][j] = 'B';
                } else if (i % 2 == 1 && j % 2 == 0) {
                    chars[i][j] = 'B';
                }else {
                    chars[i][j] = 'W';
                }
            }
        }
        return chars;
    }
}