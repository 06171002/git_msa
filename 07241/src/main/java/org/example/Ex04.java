package org.example;

public class Ex04 {

    public static void main(String[] args) {

        try {
            throw  new MyException(new ErrorCode("12","34","56"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
