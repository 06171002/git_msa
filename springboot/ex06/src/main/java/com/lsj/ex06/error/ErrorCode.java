package com.lsj.ex06.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    DUPLICATE_USER(HttpStatus.BAD_REQUEST,"email already exist");

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
