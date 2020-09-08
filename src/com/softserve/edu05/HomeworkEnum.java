package com.softserve.edu05;

import java.util.Scanner;

enum HTTPError {
	
HTTP400("Bad Request"), 
HTTP401("Unauthorized"), 
HTTP402("Payment Required"), 
HTTP403("Forbidden"), 
HTTP404("Not Found"), 
HTTP405("Method Not Allowed "), 
HTTP406("Not Acceptable");

	private String message;
	
	private HTTPError (String message) {
		this.message = message;
	}
		
		public String getMessage() {
			return message;
		}
	
}

	public class HomeworkEnum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter code of HTTP error ");
		
		int code = scan.nextInt();

		try {
			HTTPError obj =  HTTPError.valueOf("HTTP" + code);
			System.out.println(obj.getMessage());
		} catch (Exception e) {
			System.out.println("Code doesn't exict");
		}
		
		scan.close();
	}
	}
