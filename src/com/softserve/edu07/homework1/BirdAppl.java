package com.softserve.edu07.homework1;

public class BirdAppl {

	public static void main(String[] args) {
		Bird[] birds = {
			new Swallow(),
			new Eagle(),
			new Penguin(),
			new Chicken()	
		};
		
		birds[0].setFeather("black, blue, white");
		birds[0].setLayEggs(true);
		
		birds[1].setFeather("long, braun and white");
		birds[1].setLayEggs(true);
		
		birds[2].setFeather("short, black and white");
		birds[2].setLayEggs(true);
	
		birds[3].setFeather("different colours");
		birds[3].setLayEggs(true);
		
		for (Bird i:birds) {
			i.fly();
			System.out.println(i.toString());
		}
		
	}

}
