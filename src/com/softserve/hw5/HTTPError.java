package com.softserve.hw5;

enum HTTPError {
    HTTP400("Bad request"),
    HTTP401("Unauthorized"),
    HTTP402("Payment Required"),
    HTTP403("Forbidden"),
    HTTP404("Not found"),
    HTTP000("Invalid Code");

private String massage;

private HTTPError(String massage) {
    this.massage = massage;
}

public String getMassage() {
    return massage;
}
}