package com.softserve.edu.lesson06.homework.task1;

public class Appl {
	public static void main(String[] args) {
		Bird[] bird = new Bird[6];
		bird[0] = new Eagle();
		bird[0].setFeathers(true);
		bird[0].setLayEggs(true);

		bird[1] = new Swallow();
		bird[1].setFeathers(true);
		bird[1].setLayEggs(true);

		bird[2] = new Penguin();
		bird[2].setFeathers(false);
		bird[2].setLayEggs(true);

		bird[3] = new Chicken();
		bird[3].setFeathers(true);
		bird[3].setLayEggs(true);

		bird[4] = new Swallow();
		bird[4].setFeathers(true);
		bird[4].setLayEggs(true);

		bird[5] = new Chicken();
		bird[5].setFeathers(true);
		bird[5].setLayEggs(true);

		for (int i = 0; i < bird.length; i++) {
			bird[i].fly();
			if (bird[i].isFeathers()) {
				System.out.println("Have feathers");
			} else
				System.out.println("without feathers");
			if (bird[i].isLayEggs()) {
				System.out.println("Lay eggs\n");
			} else
				System.out.println("dont lay eggs\n");
		}

	}

}
