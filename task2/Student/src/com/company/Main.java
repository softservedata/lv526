package com.company;

class Studak {
    private String name;
    private int rating;
    private static int number = 0;
    private static int sum = 0;

    public Studak() {
        number++;
    }

    public Studak(String name) {
        this.name = name;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sum += rating;
    }

    public static double getAvgRating() {
        return (double) sum / number;
    }

    public boolean betterStudent(Studak student) {
        return this.getRating() > student.getRating();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rating=" + rating + "]";
    }
}



public class Main {

    public static void main(String[] args) {
        Studak student1 = new Studak("Oleg");
        student1.setRating(4);
        Studak student2 = new Studak("Anna");
        student2.setRating(5);
        Studak student3 = new Studak();
        student3.setName("Mary");
        student3.setRating(4);
        System.out.println("Out students");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println();
        System.out.print("Student 1 has better rating than student2 ");
        System.out.println(student1.betterStudent(student2));
        System.out.println();
        System.out.printf("Average rating is " + "%.2f", Studak.getAvgRating());
    }

}

