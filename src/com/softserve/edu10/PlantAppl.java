package com.softserve.edu10;

public class PlantAppl {

	public static void main(String[] args) {
		
		Plant p1 = new Plant(4, Color.BLUE, Type.FLOWER);
		Plant p2 = new Plant(1, "green", "bush");
		Plant p3 = new Plant(3, "black", "palm");//Invalid color and type
		Plant p4 = new Plant(2, "braun", "tree"); //Invalid color
		Plant p5 = new Plant(1, "orange", "frlower"); //Invalid type
		
	}
}

