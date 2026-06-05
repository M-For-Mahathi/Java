package com.mahathi.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    //Only runs once when the 1st obj is created, i.e., class is loaded in memory for the 1st time
    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
    
}
