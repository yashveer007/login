package com.ecom.login.services;

import com.ecom.login.constants.LoginConstants;
import com.ecom.login.dao.CustomerDao;
import com.ecom.login.dto.CustomerDto;
import com.ecom.login.entities.Customer;
import com.ecom.login.exceptionhandler.CustomerNotFoundException;
import com.ecom.login.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao repo;

    @Autowired
    private CommonUtils commonUtils;

    @Override
    public String saveCustomer(CustomerDto customerDto) {
        try{
            Customer customer =repo.save(commonUtils.customerDtoToCustomer(customerDto));
        }catch (Exception ex){
            // need to add exception
        }
        return LoginConstants.ACCOUNT_CREATED;
    }

    @Override
    public boolean fetchCustomerByCustomerId(int customerId) {
        boolean isValid = false;
        try{
            Optional<Customer> optional = repo.findById(customerId);
            if(optional.isPresent()){
                Customer customer = optional.get();

            }else{
                throw new CustomerNotFoundException("Account isn't present for this customerid, Eneter valid customerId or Register yourself!!");
            }
        }catch (Exception ex){

        }
        return isValid;
    }
}