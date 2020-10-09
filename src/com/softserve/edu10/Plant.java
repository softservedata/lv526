package com.softserve.edu10;

enum Type {
    FLOWER, TREE, HERBS, BUSH, MUSHROOM
}

enum Color {
    YELLOW, RED, PINK, WHITE, ORANGE, BLUE, GREEN
}
public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }
    
    public Plant(int size, String color, String type) throws ColorException, TypeException{
    	this.size = size;
    	
    	try {
    		this.color =Color.valueOf(color.toUpperCase());
    	} catch (IllegalArgumentException e) {
    		throw new ColorException("Invalid color");
    	}
    	
    	try {
    	this.type =Type.valueOf(type.toUpperCase());
    	} catch (IllegalArgumentException e) {
    		throw new TypeException("Invalid type");
    	}
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color.toString().toLowerCase() +
                ", type=" + type.toString().toLowerCase() +
                '}';
    }
}
