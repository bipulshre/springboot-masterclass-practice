package com.example.springdemo2.customer;

//model
public class Customer{
    private final Long id;
    private final String name;
    private  final String password;

    public Customer(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
//the properties are comming from these getter and setters which are seen in ui

    public Long getId() {
        return id;
    }

    public Long getCustomerId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
