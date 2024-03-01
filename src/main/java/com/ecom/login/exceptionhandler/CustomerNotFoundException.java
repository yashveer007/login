package com.ecom.login.exceptionhandler;

public class CustomerNotFoundException extends RuntimeException{

    String exceptionMsg;

    public CustomerNotFoundException(String ex){
        this.exceptionMsg = ex;
    }

}
