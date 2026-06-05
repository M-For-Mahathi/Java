package com.mahathi.staticExample;

public class Main {
    public static void main(String[] args) {
        Human johndoe = new Human(25, "John Doe", 50000, false);
        Human janeDoe = new Human(30, "Jane Doe", 60000, true);

        System.out.println(johndoe.name);
        System.out.println(johndoe.population);
        System.out.println(janeDoe.population);
        System.out.println(Human.population);
    }
}
