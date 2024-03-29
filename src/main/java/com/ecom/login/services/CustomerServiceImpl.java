package com.ecom.login.services;

import com.ecom.login.dao.CustomerDao;
import com.ecom.login.dto.CustomerDto;
import com.ecom.login.dto.LoginDto;
import com.ecom.login.entities.Customer;
import com.ecom.login.exceptionhandler.CustomerNotFoundException;
import com.ecom.login.exceptionhandler.SomethingWentWrongException;
import com.ecom.login.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao repo;

    @Autowired
    private CommonUtils commonUtils;

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        try{
            Customer customer = repo.save(commonUtils.customerDtoToCustomer(customerDto));
            log.info("Saved Customer: " + customer);
            return commonUtils.covertCustomerToCustomerDto(customer);
        }catch (Exception ex){
            throw new CustomerNotFoundException("fjoirj");
        }
    }

    @Override
    public CustomerDto fetchCustomerByCustomerId(int customerId) {
        try{
            Optional<Customer> optional = repo.findById(customerId);
            if(optional.isPresent()){
                Customer customer = optional.get();
                return commonUtils.covertCustomerToCustomerDto(customer);
            }else{
                throw new CustomerNotFoundException("Account isn't present for this customerId, Enter valid customerId or Register yourself!!");
            }
        }catch (CustomerNotFoundException ex){
            throw new CustomerNotFoundException("Account isn't present for this customerId, Enter valid customerId or Register yourself!!");
        }catch (Exception ex){
            throw new SomethingWentWrongException("Something went wrong, Please retry or Call us on - 0110 -0596261");
        }
    }

    @Override
    public String fetchCustomerByEmailId(LoginDto loginDto) {
        try{
             Customer customer = repo.findCustomerByEmailIdAndPassword(loginDto.getEmailId(), loginDto.getPassword());
             if(customer!=null){
                return "Success";
             }else{
                 throw new CustomerNotFoundException("Account isn't present for this customerid, Eneter valid customerId or Register yourself!!");
             }
        }catch (Exception ex){
            throw new SomethingWentWrongException(ex.getMessage());
        }
    }
}
