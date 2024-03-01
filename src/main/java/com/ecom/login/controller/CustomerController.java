package com.ecom.login.controller;

import com.ecom.login.dto.CustomerDto;
import com.ecom.login.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*Input ~ CustomerDto
    *
    * Saving Customer details in Db
    *
    * Output ~ String
    * */
    @PostMapping("/register")
    private String registerCustomerLogin(@Validated @RequestBody CustomerDto customerDto){
        log.info("Inside saveCustomerLogin() method");
        String msg = customerService.saveCustomer(customerDto);
        log.info("Successfully save Customer data in DB");
        return msg;
    }

    @GetMapping("/login/{customerId}")
    private boolean validateCustomer(@PathVariable("customerId") String customerId){
        log.info("validating user details");

        return true;
    }

}
