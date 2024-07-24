package org.example;

public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(ErrorCode errorCode){
        super(errorCode.getMessage());

    }

    public MyException(String message) {
        super(message);
    }
}
