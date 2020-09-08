package com.softserve.edu5.homework.Dog;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, Enum breed, int age) {
        this.name = name;
        this.breed = breed.toString();
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dog{name='" + this.name + '\'' + ", breed='" + this.breed + '\'' + ", age=" + this.age + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Dog dog = (Dog)o;
            if (this.age != dog.age) {
                return false;
            } else {
                if (this.name != null) {
                    if (this.name.equals(dog.name)) {
                        return this.breed != null ? this.breed.equals(dog.breed) : dog.breed == null;
                    }
                } else if (dog.name == null) {
                    return this.breed != null ? this.breed.equals(dog.breed) : dog.breed == null;
                }

                return false;
            }
        } else {
            return false;
        }
    }

    public boolean compareOnNotSame(Object o, Object o1) {
        if (!o.equals(o1) || !this.equals(o) || !this.equals(o1)) {
            System.out.println("\t\tNo same objects");
            return true;
        }else{
            System.out.println("\t\tThey are same");
        }return  false ;

    }

    public Object oldestDog(Object o1, Object o2) {
        Dog other1 = (Dog)o1;
        Dog other2 = (Dog)o2;
        if (this.age > other1.age && this.age > other2.age) {
            System.out.println(this.toString());
            return this.toString();
        } else if (other1.age > this.age && other1.age > other2.age) {
            System.out.println(other1.toString());
            return other1.toString();
        } else if (other2.age > this.age && other2.age > other1.age)
            System.out.println(other2.toString());
            return other2.toString();

    }

    public int hashCode() {
        int result = this.name != null ? this.name.hashCode() : 0;
        result = 31 * result + (this.breed != null ? this.breed.hashCode() : 0);
        result = 31 * result + this.age;
        return result;
    }
}
