package com.softserve.edu07.homework1;

public abstract class Bird {

	private String feather;
	private boolean layEggs;
	

	public String getFeather() {
		return feather;
	}
	public void setFeather(String feather) {
		this.feather = feather;
	}
	public boolean isLayEggs() {
		return layEggs;
	}
	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	
	
	
	@Override
	public String toString() {
		return "[feather=" + feather 
				+ ", layEggs=" + layEggs
				+ "]";
	}
	public abstract void fly();

}
