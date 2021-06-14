package com.denis.bookstore;

public class Address {
    private String addressId;
    private String street;
    private int number;
    private String city;
    private String zipCode;



    public Address(String addressId, String street, int number, String city, String zipCode) {
        this.addressId = addressId;
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
