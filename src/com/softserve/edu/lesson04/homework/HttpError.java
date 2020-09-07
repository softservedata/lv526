package com.softserve.edu.lesson04.homework;

public enum HttpError {
	ERROR400("Bad Request"), ERROR401("Unauthorized"), ERROR402("Payment Required"), ERROR403("Forbidden"),
	ERROR404("Not Found"), ERROR405("Method Not Allowed"), ERROR999("Wrong code");

	private String messege;

	private HttpError(String massege) {
		this.messege = massege;
	}

	public String getMassege() {
		return messege;
	}
}
