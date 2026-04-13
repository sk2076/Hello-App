package com.example;
public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length == 0) {
            greeting = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String name : args) {
                sb.append(name);
                sb.append(", ");
            }
            greeting = sb.substring(0, sb.length() - 2);
        }
        System.out.println("Hello, " + greeting + "!");
    }
}