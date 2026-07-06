package com.wisejoel77.composition;

public class Address {
    String country;
    String state;
    String city;
    int pinCode;

    public Address(String country, String state, String city, int pinCode){
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
    }

    public void getAddress(){
        System.out.println("Address: " + country + ", " + state + ", " + city + ", " + pinCode);
    }
}
