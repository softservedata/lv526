package com.softserve.edu.homework6;

public abstract class Bird {

	private boolean feathers;
	private boolean layEggs;
	private boolean flying;
	
	public Bird(boolean feathers, boolean layEggs, boolean flying) {
		
		this.feathers = feathers;
		this.layEggs = layEggs;
		this.flying = flying;
	}

	public boolean isFeathers() {
		return feathers;
	}	
	public boolean isLayEggs() {
		return layEggs;
	}
	public boolean isFlying() {
		return flying;
	}
	public void fly() {
        System.out.println("I can" 
                + (flying ? " " : " not ") +"fly");
	}
	
	@Override
    public String toString() {
        return "[feathers = " + feathers
                + ", layEggs = " + layEggs
                + ", flying = " + flying
                + "]";
    }

}