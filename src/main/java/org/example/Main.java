package org.example;

public class Main {
    private static final String message;

    static {
        message = System.getProperty("message");
    }

    public static void main(String[] args) {
        System.out.println(STR."你好世界! My message is: \{message}");
    }
}