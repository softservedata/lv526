package com.softserve.edu05;

public enum Country {

    GERMANY("Europe"), USA("North Amerika"), ARGENTINA("South Amerika"), EGYPT("Africa"), AUSTRALIA("Australia");

    private final String country;

    Country(String country) {
        this.country = country;
    }


    public String getCountry() {
        return country;
    }
}


