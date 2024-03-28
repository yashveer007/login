package com.ecom.login.services;

import com.ecom.login.dto.CustomerDto;
import com.ecom.login.dto.LoginDto;

public interface CustomerService {

    CustomerDto saveCustomer(CustomerDto customerDto);
    CustomerDto fetchCustomerByCustomerId(int customerId);
    String fetchCustomerByEmailId(LoginDto loginDto);

}
