package com.testing;

public class Test {
    public static void main(String[] args) {
        System.out.println("test docker avec java");
        TestKata testKata = new TestKata();
        System.out.println("Converting string to uppercase :");
        System.out.println(testKata.convertString("hello world"));
    }
}
