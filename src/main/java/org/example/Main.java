package org.example;

public class Main {
    private static final String message;

    static {
        message = System.getProperty("message");
    }

    public static void main(String[] args) {
        System.out.println(STR."Hello, World! My message is: \{message}");
    }
}