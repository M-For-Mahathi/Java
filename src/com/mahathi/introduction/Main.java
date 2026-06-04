package com.mahathi.introduction;

public class Main {
    public static void main(String[] args) {
        //stores 5 roll nums
        int[] rollNums = new int[5];

        //stores 5 names
        String[] names = new String[5];

        //stores data of 5 students : {roll num, name, marks}
        int[] rnum = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //create class Student with fields name, age, marks. Add a constructor. Add a method displayInfo(). Create 3 objects and call the method.

        Student mahathi = new Student(13, "Mahathi", 90.0f);
        // mahathi.rnum = 1;
        // mahathi.name = "Mahathi";
        // mahathi.marks = 90.0f;
        Student siri = new Student(14, "Siri", 89.7f); 
        //Student(String name, int age, float marks) is a constructor that initializes the object with the given values

        System.out.println(mahathi.rnum);
        System.out.println(mahathi.name);
        System.out.println(mahathi.marks);
        System.out.println();
        mahathi.greeting();
        siri.greeting();
        System.out.println();
        mahathi.displayInfo();
        System.out.println();
        siri.displayInfo();
        //mahathi and siri are two objects of the Student class, they have their own copy of the instance variables and can call the instance methods to display their information

    }
}

//create a class for every single student
class Student{
    int rnum;
    String name;
    float marks;

    // Student(){
    //     // this keyword is used to refer to the current object
    //     this.rnum = 1;
    //     this.name = "Mahathi";
    //     this.marks = 90.0f;

    //     this.rnum = 2;
    //     this.name = "Siri";
    //     this.marks = 80.0f;
    // }

    //greeting function
    void greeting(){
        System.out.println("Hello, my name is : " + this.name);
    }

    Student(int rnum, String name, float marks){

        // this keyword is used to refer to the current object
        this.rnum = rnum;
        this.name = name;
        this.marks = marks;

    }

    //function to display the info of the student
    void displayInfo(){
        System.out.println("Roll Number: " + this.rnum);
        System.out.println("Name: " + this.name);
        System.out.println("Marks :" + this.marks);
        System.out.println();
    }
}
