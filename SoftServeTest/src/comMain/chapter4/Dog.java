package chapter4;

import java.util.Scanner;

public class Dog {
    private String name;
    private String breed;
    private int age;
    Scanner scanner = new Scanner(System.in);

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
        this.name = "";
        this.age = 0;
        this.breed = "";
    }

    private static Dog input() {
        String nameTest;
        String breedTEst;
        int ageTEst;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dog name");
        nameTest = scanner.nextLine();
        System.out.println("Enter dog breed");
        breedTEst = scanner.nextLine();
        System.out.println("Enter dog age");
        ageTEst = Integer.parseInt(scanner.nextLine());
        return new Dog(nameTest, breedTEst, ageTEst);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Nazar", "gav", 8);

    }
}
