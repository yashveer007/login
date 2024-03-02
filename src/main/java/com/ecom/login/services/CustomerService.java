package com.ecom.login.services;

import com.ecom.login.dto.CustomerDto;
import com.ecom.login.dto.LoginDto;

public interface CustomerService {

    String saveCustomer(CustomerDto customerDto);
    CustomerDto fetchCustomerByCustomerId(int customerId);
    String fetchCustomerByEmailId(LoginDto loginDto);

}
