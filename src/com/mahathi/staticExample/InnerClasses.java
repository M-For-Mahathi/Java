package com.mahathi.staticExample;

public class InnerClasses { //outside classes cannot be static
    static class Test{ //inner classes can be static
        String name;

        public Test(String name) {
            this.name = name;
        }

    }
    
    public static void main(String[] args) {
        Test a = new Test("John");
        System.out.println(a.name);
    }
}
