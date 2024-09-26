package com.lsj.ex10.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    DUPLICATE_USER(HttpStatus.BAD_REQUEST,"email already exist"),
    NOT_FOUND(HttpStatus.BAD_REQUEST,"not exist content");

    private HttpStatus httpStatus;
    private String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}
