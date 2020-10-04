package com.softserve.edu.homework9.pt2;

public class Plant {
	private Type type;
	private Color color;
	private int size;

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color col = colorStrToEnum(color);
		Type typ = typeStrToEnum(type);
		this.type = typ;
		this.color = col;
		this.size = size;
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.BLUE;
		case "red":
			return Color.RED;
		case "white":
			return Color.WHITE;
		default:
			throw new ColorException("Input only color blue, red or white");
		}
	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.ROSE;
		case "daisy":
			return Type.DAISY;
		case "bluebell":
			return Type.BLUEBELL;
		case "iris":
			return Type.IRIS;
		case "lily":
			return Type.LILY;
		default:
			throw new TypeException("Input only type Rose, Daisy, Bluebell, Iris or Lily");
		}
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Plant [type=" + type.toString().toLowerCase() 
				+ ", color=" + color.toString().toLowerCase() 
				+ ", size="	+ size 
				+ "]";
	}
}