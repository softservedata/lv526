package com.softserve.edu.pt7.two;

public class Persons {

	public static void main(String[] args) {
		Person[] p = {
				new Teacher(),
				new Cleaner(),
				new Student()
				};
		
		   for(int i = 0; i < p.length; i++){
	            p[i].print();
	            
	            if(p[i] instanceof Staff){
	                ((Staff) p[i]).salary();
	                System.out.println("------------------");
	            }
	        }
	    }

}
