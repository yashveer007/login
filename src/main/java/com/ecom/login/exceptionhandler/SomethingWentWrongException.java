package com.ecom.login.exceptionhandler;

public class SomethingWentWrongException extends RuntimeException {
    String msg;

    public SomethingWentWrongException(String msg){
        this.msg = msg;
    }
}
