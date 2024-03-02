package com.ecom.login.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {

    private String emailId;
    @Size(min = 8)
    @Pattern(regexp = "^[a-zA-Z0-9]{8,15}", message = "length must me 8 or more")
    private String password;
}
