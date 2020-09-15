package com.softserve.edu.homework5;

public enum Breed {
	BULLDOG, DALMATIAN, CHIHUAHUA;

	public static class Dog {
		private Breed breed;
		private String name;
		private int age;

		public Dog (Breed breed, String name, int age) {
			this.breed = breed;
			this.name = name;
			this.age = age;
		}

		public Breed getBreed() {
			return breed;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
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
			System.out.println("\tDog.equals running");
			if (this == obj) {
				return true;
			}
			if ((obj == null) || (getClass() != obj.getClass())) {
				return false;
			}
			Dog other = (Dog) obj;
			if ((age != other.age) 
					|| ((breed == null) && (other.breed != null))
					|| ((breed != null) && (other.breed == null))
					|| (breed != other.breed)
					|| ((name == null) && (other.name != null)) 
					|| ((name != null) && (other.name == null))) {
				return false;
			}
			return ((name == null) && (other.name == null)) 
					|| name.equals(other.name);
		}

		@Override
		public String toString() {
			return "Dog [" + "breed - " + breed.name().toLowerCase()
					+ ", " + "name - " + name + ", age - " + age + " year(s)]";
		}

		public static boolean isDuplicateNames(Dog[] dogs) {
			boolean result = false;
			for (int i = 0; i < (dogs.length - 1) && !result; i++) {
				for (int j = i + 1; (j < dogs.length) && !result; j++) {
					if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
						result = true;
						System.out.println("Duplicate name:\n" + dogs[i] + " \n" + dogs[j]);		
					}
				}
			}
			return result;
		}

		public static Dog getOldest(Dog[] dogs) {
			Dog result = dogs[0];
			for (Dog currentDog : dogs) {
				if (currentDog.getAge() > result.getAge()) {
					result = currentDog;
				}
				
			}
			return result;
		}
		public static void main(String[] args) {

			Dog[] dogs = { new Dog(Breed.BULLDOG, "Rolf", 4),
					       new Dog(Breed.DALMATIAN, "Zak", 3),
					       new Dog(Breed.CHIHUAHUA, "Molly", 6), 		       
			};
			System.out.println("isDuplicateNames: " + Dog.isDuplicateNames(dogs));
	        System.out.println("Oldest Dog: " + Dog.getOldest(dogs));
		}
	}
}
