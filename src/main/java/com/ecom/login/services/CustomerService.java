package com.ecom.login.services;

import com.ecom.login.dto.CustomerDto;

public interface CustomerService {

    String saveCustomer(CustomerDto customerDto);
    CustomerDto fetchCustomerByCustomerId(int customerId);
    String fetchCustomerByEmailId(String emailid);

}
