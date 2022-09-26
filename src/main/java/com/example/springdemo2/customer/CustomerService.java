package com.example.springdemo2.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//business logic for domain where we implement data retrival and manipulation

@Service
public class CustomerService { //customer service is now a singleton so if we inject in many classes we are getting same instance


    private final CustomerRepo customerRepo;


    @Autowired
    public CustomerService(
            CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer(){
        return customerRepo.getCustomer();
    }
}
