package com.ecom.login.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorResponse {
    private String message;
    private HttpStatus httpStatus;
    private boolean success;
}
