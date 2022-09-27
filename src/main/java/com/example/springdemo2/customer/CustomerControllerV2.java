package com.example.springdemo2.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping(path = "api/v2/customer")
@RestController //handle http request
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired //we want to inject customerService here
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;

    }

    @GetMapping(value = "all") //for requesting data
    List<Customer> getCustomer(){
        return Arrays.asList(
                new Customer(1l, "RAM","PAS")
        );
    }

    //post for sending data, put for updating data, delete to delete data

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("post requrest....");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("update requrest....");
        System.out.println(customer);
    }

    @DeleteMapping(path ="{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("delete customer with id requrest" + id);

    }

}
