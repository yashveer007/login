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

    public CustomerDto covertCustomerToCustomerDto(Customer customer){
        return CustomerDto.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .age(customer.getAge())
                .phoneNo(customer.getPhoneNo())
                .emailId(customer.getEmailId())
                .password(customer.getPassword())
                .build();
    }
}
