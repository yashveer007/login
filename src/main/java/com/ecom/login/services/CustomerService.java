package com.ecom.login.services;

import com.ecom.login.dto.CustomerDto;

public interface CustomerService {

    String saveCustomer(CustomerDto customerDto);
    boolean fetchCustomerByCustomerId(int customerId);

}
