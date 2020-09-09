package com.softserve.edu.task3.country;

public enum Country {

    UKRAINE("Europe"),
    USA("America"),
    SIDNEY("Australia"),
    CHINA("Asia"),
    COUNTRY("Not Found");

    private String continent;

    Country(final String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}
