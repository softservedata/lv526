package com.softserve.edu04;

public class ApplPerson {
	public static void main (String[] args) {
		//Person class code
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.input();
		p2.input();
		p3.input();
		p4.input();
		p5.input();
		
		p1.changeName("Stas", "Lukianchuk");
		p2.changeName("Ivan", "Ivanov");
		p3.changeName("Olya", "Kostash");
		p4.changeName("Petro", "Petrov");
		p5.changeName("Viktor", "Pelevin");
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
	}
	
}
