package com.chapter3;

public class HomeWorkExampleStudent {
    private String name;
    private int rating;
    private static int count = 0;
    private static double ratingActual = 0;

    public HomeWorkExampleStudent(String name, int rating) {
        this.name = name;
        this.rating = rating;
        ratingActual += rating;
        count++;
    }

    public HomeWorkExampleStudent() {
        count++;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public static double avgRating() {

        return ratingActual / count;
    }

    public static boolean betterStudent(HomeWorkExampleStudent homeWorkExampleStudent1, HomeWorkExampleStudent homeWorkExampleStudent2) {
        return homeWorkExampleStudent1.rating > homeWorkExampleStudent2.rating;
    }

    @Override
    public String toString() {
        return "HomeWorkExampleStudent{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        HomeWorkExampleStudent homeWorkExampleStudent = new HomeWorkExampleStudent("Petro", 5);
        HomeWorkExampleStudent homeWorkExampleStudent1 = new HomeWorkExampleStudent("Nazar", 10);
        System.out.println(homeWorkExampleStudent);
        System.out.println(homeWorkExampleStudent1);
        System.out.println(betterStudent(homeWorkExampleStudent1, homeWorkExampleStudent1));
        System.out.println("Avarage rating is : " + avgRating());
    }
}
