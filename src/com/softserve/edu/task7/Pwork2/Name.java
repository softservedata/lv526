package com.softserve.edu.task7.Pwork2;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.formatOwnName(this.firstName);
    }

    public String getMiddleName() {
        return this.formatOwnName(this.middleName);
    }

    public String getLastName() {
        return this.formatOwnName(this.lastName);
    }

    public String getPublicName(){
        return this.formatPublicName(this.firstName, this.middleName, this.lastName);
    }

    public String getFullName() {
        return this.formatFullName(this.firstName, this.middleName, this.lastName);
    }

    public String formatPublicLastname(String lastName) {
        return this.formatOwnName(lastName);
    }

    public String formatPublicMiddleName(String middleName) {
        return middleName.substring(0, 1).toUpperCase() + ".";
    }

    public String formatPublicFirstName(String firstName) {
        return firstName.substring(0, 1).toUpperCase() + ".";
    }

    public String formatFullName(String firstName, String middleName, String lastName) {
        return this.formatPublicLastname(lastName) + " " + this.formatPublicFirstName(firstName) + this.formatPublicMiddleName(middleName);
    }

    public String formatOwnName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public String formatPublicName(String firstName, String middleName, String lastName) {
        return this.formatOwnName(lastName) + " " + this.formatOwnName(firstName) + " " + this.formatOwnName(middleName);
    }
}
