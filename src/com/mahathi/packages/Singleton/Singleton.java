package com.mahathi.packages.Singleton;

public class Singleton { //class in which only one object can be created
    private Singleton() { //private constructor so that no other class can create an object of this class

    }

    private static Singleton instance; //static variable to hold the single instance of the class

    public static Singleton getInstance() { //static method to return the single instance of the class
        if (instance == null) { //if instance is null, create a new instance
            instance = new Singleton();
        }
        return instance; //return the single instance of the class
    }
    
}
