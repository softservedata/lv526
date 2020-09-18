package com.softserve.edu05;

enum Breed {
	TERRIER, BULLDOG, DULMATIAN;
}

public class Dog {
	
	private String name;
	private Breed breed;
	private int age;

	
	public Dog() {
		name = null;
		breed = null;
		age = 0;
	}
	
	public Dog(String name, String breed, int age) {
			this.name = name;
			try {
			this.breed = Breed.valueOf(breed.toUpperCase());
			} catch (Exception e) {
				System.out.println("Breed wasn't saved. Available values for this field: terrier, bulldog, dulmatian");
			}
			this.age = age;
		}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Breed getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		try {
			this.breed = Breed.valueOf(breed.toUpperCase());
			} catch (Exception e) {
				System.out.println("Breed wasn't saved. Available values for this field: terrier, bulldog, dulmatian");
			}
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Dog other = (Dog) obj;
		if ((age != other.age) || (breed != other.breed)) {
			return false;
		}
		if (((breed == null) && (other.breed != null)) && ((breed != null) && (other.breed == null))
				|| (!breed.equals(other.breed))) {
			return false;
		} else if ((breed.equals(other.breed)) || ((breed == null) && (other.breed == null))) {
			return true;
		}
		if (((name == null) && (other.name != null)) && ((name != null) && (other.name == null))
				|| (!name.equals(other.name))) {
			return false;
		} else if ((name.equals(other.name)) || ((name == null) && (other.name == null))) {
			return true;
		} else {
			return false;
		}
	}
		
	}



	

	

