package com.ecom.login.utils;

import com.ecom.login.dto.CustomerDto;
import com.ecom.login.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public Customer customerDtoToCustomer(CustomerDto customerDto){
        return Customer.builder()
                .firstName(customerDto.getFirstName())
                .lastName(customerDto.getLastName())
                .phoneNo(customerDto.getPhoneNo())
                .emailId(customerDto.getEmailId())
                .age(customerDto.getAge())
                .password(customerDto.getPassword())
                .build();
    }
}
