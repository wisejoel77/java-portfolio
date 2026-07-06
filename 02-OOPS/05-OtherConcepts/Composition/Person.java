package com.wisejoel77.composition;

public class Person {
    String name;
    int age;
    Address address;

    public Person(String name, int age, String country, String state, String city, int pinCode){
        this.name = name;
        this.age = age;
        address = new Address(country,state,city,pinCode);
    }

    public void getDetails(){
        System.out.println("Name: " + name + "\nAge: " + age);
        address.getAddress();
    }
}
