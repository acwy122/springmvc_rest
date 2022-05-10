package com.mashibing.bean;

public class Address {
    private String provice;
    private String city;
    private String town;

    public Address(String provice, String city, String town) {
        this.provice = provice;
        this.city = city;
        this.town = town;
    }

    public Address() {
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "provice='" + provice + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
