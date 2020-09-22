package com.softserve.edu.homework6;

public class Birds {

	public static void main(String[] args) {

          Bird eagle = new Eagle(); 
          Bird swallow = new Swallow(); 
          Bird penguin = new Penguin(); 
          Bird chicken = new Chicken(); 
                   
          Bird[] birds = {eagle, swallow, penguin, chicken};
		
          for (Bird bird : birds) {
	      bird.fly();
	      System.out.println(bird);
}
	}
}
