package com.example.springdemo2.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//Data Access layer (DAO) layer
//later used to connect to real database
@Repository
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomer() {
        //TODO connect to real db
        return Collections.singletonList(
                new Customer(1L,"todo name", "todo password")
        );
    }
}
