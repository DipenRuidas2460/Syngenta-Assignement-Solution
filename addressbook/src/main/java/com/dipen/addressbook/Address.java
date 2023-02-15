package com.dipen.addressbook;

public class Address {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pincode;

    public Address(String firstName, String lastName, String address, String city, String state, String pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {
    }

    // ToString :---
    
    @Override
    public String toString() {
        return "Address [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", pincode=" + pincode + "]";
    }

    // Setters:--

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    // Getters:---

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPincode() {
        return pincode;
    }
}
