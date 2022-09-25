package com.example.springdemo2.customer;

import org.springframework.stereotype.Component;

//business logic for domain where we implement data retrival and manipulation

@Component //it creates a bean that we can inject in multiple places

public class CustomerService { //customer service is now a singleton so if we inject in many classes we are getting same instance

    Customer getCustomer(){
        return new Customer(1l,"ram");
    }
}
