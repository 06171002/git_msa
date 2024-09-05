package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Runnable runnable = () ->{
            for (int i = 0; i<1000;i++)
                System.out.println(Thread.currentThread().getName() + " " + i);
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            Thread th1 = Thread.currentThread();
            System.out.println(th1.getName() + " " + i);

        }


    }
}