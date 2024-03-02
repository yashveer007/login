package com.ecom.login.exceptionhandler;

public class SomethingWentWrongException extends RuntimeException {
    String message;

    public SomethingWentWrongException(String message){
        this.message = message;
    }
}
