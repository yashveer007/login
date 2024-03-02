package com.ecom.login.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> customerNotFoundExceptionHandler(CustomerNotFoundException ex){
        ApiErrorResponse apiErrorResponse = new ApiErrorResponse(ex.message, HttpStatus.NOT_FOUND,false);
        return new ResponseEntity<>(apiErrorResponse,HttpStatus.OK);
    }

    @ExceptionHandler(SomethingWentWrongException.class)
    public ResponseEntity<ApiErrorResponse> somethingWentWrongExceptionExceptionHandler(SomethingWentWrongException ex){
        ApiErrorResponse apiErrorResponse = new ApiErrorResponse(ex.message, HttpStatus.NOT_FOUND,false);
        return new ResponseEntity<>(apiErrorResponse,HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> globalExceptionHandler(Exception ex){
        ApiErrorResponse apiErrorResponse = new ApiErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND,false);
        return new ResponseEntity<>(apiErrorResponse,HttpStatus.OK);
    }



}
