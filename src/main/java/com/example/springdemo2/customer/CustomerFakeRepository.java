package com.example.springdemo2.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "fake")
public class CustomerFakeRepository implements CustomerRepo  {

    @Override
    public List<Customer> getCustomer() {
       return Arrays.asList(
                new Customer(1l,"ram", "123"),
                new Customer(2l,"Shyam", "1234")
        );
    }
}
