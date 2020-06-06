package org.fitznet.doomdns;

public class Address {
    private String street;
    private String city;
    private int zipCode;
    private String state;


    public Address(String street, String city, int zipCode, String state){
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
    }
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCpde) {
        this.zipCode = zipCpde;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
