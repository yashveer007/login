package com.ecom.login.exceptionhandler;

public class CustomerNotFoundException extends RuntimeException{

    String message;

    public CustomerNotFoundException(String message){
        this.message = message;
    }

}
