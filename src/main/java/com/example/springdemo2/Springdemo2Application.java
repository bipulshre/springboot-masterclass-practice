package com.example.springdemo2;

import com.example.springdemo2.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Springdemo2Application {

    public static void main(String[] args) {

        //This is the main class of our application form which the Spring Boot application will get executed.
        //It creates an appropriate ApplicationContext instance and load beans.
        SpringApplication.run(Springdemo2Application.class, args);
    }
}


