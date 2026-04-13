package com.example;
public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length == 0) {
            greeting = "World";
        } else {
            greeting = String.join(", ", args);
        }
        System.out.println("Hello, " + greeting + "!");
    }
}