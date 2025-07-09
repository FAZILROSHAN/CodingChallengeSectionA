package com.codingsection;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CapitalIndexes
 * 
 * A simple program where it finds the uppercase's indexes in a given string by the user and returns the capital letter indexes.
 * 
 * Example:
 * Input:  "BLacK"
 * Output: [0, 1, 4]
 *
 * Author: FAZIL ROSHAN A
 * Date: 09-07-2025
 */
public class CapitalIndexes {

    /**
     * Finds the indexes of all uppercase letters in the given string.
     *
     * @param input the input string
     * @return a list of indexes where uppercase letters are present
     */
    public static List<Integer> capitalIndexes(String input) {
        List<Integer> indexes = new ArrayList<>();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                indexes.add(i);  // Add index if character is Capital
            }
        }

        return indexes;
    }

    /**
     * The main method that runs the program.
     * It prompts the user for input and prints the indexes of capital letters.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Get capital indexes
        List<Integer> result = capitalIndexes(userInput);

        // Output the result
        System.out.println("Indexes of capital letters: " + result);

        scanner.close();
    }
}

