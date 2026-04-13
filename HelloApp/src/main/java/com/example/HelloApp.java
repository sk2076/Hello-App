package com.example;
public class HelloApp {
    public static void main(String[] args) {
        String defname = "World";

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);

                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }
            System.out.println("Hello " + sb + "!");
        } else {
            System.out.println("Hello " + defname + "!");
        }
    }
}