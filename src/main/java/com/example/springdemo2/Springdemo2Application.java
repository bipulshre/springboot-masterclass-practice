package com.example.springdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springdemo2Application.class, args);
    }

    @GetMapping
    Customer getCustomer(){
        return new Customer(1l,"ram");
    }

}

class Customer{
    private final Long id;
    private final String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
