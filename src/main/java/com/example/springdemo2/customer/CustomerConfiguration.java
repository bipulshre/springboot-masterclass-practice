package com.example.springdemo2.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:true}")
    private boolean userFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args ->{
            System.out.println("command line runner done");
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println("use costumer fake repo:" + userFakeCustomerRepo);
        return userFakeCustomerRepo ?
                new CustomerFakeRepository():
                new CustomerRepository();
    }
}
