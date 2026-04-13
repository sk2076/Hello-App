package com.example;
public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length == 0) {
            greeting = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }
            greeting = sb.toString();
        }
        System.out.println("Hello, " + greeting + "!");
    }
}