package com.ecom.login.controller;

import com.ecom.login.dto.CustomerDto;
import com.ecom.login.dto.LoginDto;
import com.ecom.login.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private ResponseEntity<String> registerCustomerLogin(@Validated @RequestBody CustomerDto customerDto){
        log.info("Inside saveCustomerLogin() method");
        String msg = customerService.saveCustomer(customerDto);
        log.info("Successfully save Customer data in DB");
        ResponseEntity<String> response = new ResponseEntity<>(msg, HttpStatus.OK);
        return response;
    }

    @GetMapping("/get-details/{customerId}")
    private ResponseEntity<CustomerDto> validateCustomer(@PathVariable("customerId") int customerId){
        log.info("validating user details");
        CustomerDto customerDto = customerService.fetchCustomerByCustomerId(customerId);
        log.info("validated user details successfully");
        return new ResponseEntity<>(customerDto, HttpStatus.OK);
    }

    @PostMapping("/login")
    private ResponseEntity<String> login(@RequestBody LoginDto loginDto){
        log.info("Inside login() method");
        String token = customerService.fetchCustomerByEmailId(loginDto.getEmailId());
        return  new ResponseEntity<>(token, HttpStatus.OK);
    }

}
