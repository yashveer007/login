package com.ecom.login.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    private int customerId;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
    @Size(min = 8)
    @Pattern(regexp = "^[a-zA-Z0-9]{8,15}", message = "length must me 8 or more")
    private String password;
    @Size(min = 10, max = 10)
    private String phoneNo;
}