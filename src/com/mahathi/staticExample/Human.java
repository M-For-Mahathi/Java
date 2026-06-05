package com.mahathi.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population; 
    //static variable is used when we want to share a variable across all instances of a class and can be 
    // accessed using the class name. It belongs to the class rather than any specific instance. 
    // It also does not belong to any object, but rather to the class itself.
    /*Static method can only reference static data and can only call other static methods. 
    It cannot reference instance variables or instance methods directly.*/

    public Human(int age, String name, int salary, boolean isMarried){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried= isMarried;
        Human.population += 1;
    }
    
}
