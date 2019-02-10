package com.infoshareacademy.java8.interfaces;

interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}
interface B {
    default void hello() {
        System.out.println("Hello from B");
    }
}

//public class Presentation implements A, B {
//    public static void main(String... args) {
//        new Presentation().hello();
//    }
//}
