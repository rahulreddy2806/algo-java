package com.rahul.algo.strings;

public class ReverseString {

    // Method to reverse a string
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Main method to test manually
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
