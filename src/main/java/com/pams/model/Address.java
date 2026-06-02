package com.pams.model;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;

    public Address(String street){
        this.street = street;
        this.state = null;
        this.country = null;
        this.zip = null;
    }

    public Address(String street, String city, String state, String country, String zip) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toJson() {
        return String.format(
            "{"
                + "\"street\":\"%s\","
                + "\"city\":\"%s\","
                + "\"state\":\"%s\","
                + "\"zip\":\"%s\""
            + "}",
            street,
            city,
            state,
            zip
        );
    }
    
}
