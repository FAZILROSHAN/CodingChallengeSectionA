package com.codingsection;

import java.util.Scanner;

/**
 * MiddleLetter--
 * 
 * A java program to find the middle character of a string
 * 
 * if the string has odd length.it give the middle letter of the string
 * 
 * If the string has an even length, it returns an empty string.
 *
 * Example:
 * Input:  "black"     → Output: "a"
 * Input:  "opop"    → Output: ""
 * Input:  "f"       → Output: "f"
 *
 * Author: FAZIL ROSHAN A
 * Date: 09-07-2025
 */
public class MiddleLetter {

    /**
     * Returns the middle character of the input string if its length is odd.
     * Returns an empty string if the length is even.
     *
     * @param input the input string
     * @return the middle character or an empty string
     */
    public static String mid(String input) {
        int length = input.length();

        // If length is odd, return the middle character
        if (length % 2 == 1) {
            int middleIndex = length / 2;
            return String.valueOf(input.charAt(middleIndex));
        } else {
            // If length is even, return an empty string
            return "";
        }
    }

    /**
     * The main method that runs the program.
     * Prompts the user to enter a string and displays the middle character (if any).
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the function and print the result
        String result = mid(userInput);
        System.out.println("Middle letter: " + result);

        scanner.close();
    }
}
