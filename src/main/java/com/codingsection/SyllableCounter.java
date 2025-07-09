package com.codingsection;

import java.util.Scanner;

/**
 * SyllableCounter--
 *
 * A simple utility to count syllables in a word,
 * assuming syllables are separated by hyphens.
 * 
 * Example:
 * Input:  "ho-tel"       → Output: 2
 * Input:  "cat"          → Output: 1
 * Input:  "met-a-phor"   → Output: 3
 *
 * Author: FAZIL ROSHAN A
 * Date: 00-07-2025
 */
public class SyllableCounter {

    /**
     * Counts syllables in a word separated by hyphens.
     *
     * @param word the input word (syllables separated by hyphens)
     * @return the number of syllables; returns 0 if the input is empty
     */
	public static int count(String word) {
	    if (word == null || word.isBlank()) {
	        return 0;
	    }

	    String[] parts = word.split("-");
	    int count = 0;

	    // Count only non-empty syllable parts
	    for (String part : parts) {
	        if (!part.isBlank()) {
	            count++;
	        }
	    }

	    return count;
	}

    /**
     * The main method to run the syllable counter.
     * Prompts user for input and prints the syllable count.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a word with syllables separated by hyphens: ");
        String inputWord = scanner.nextLine();

        // Call function and display result
        int syllables = count(inputWord);
        System.out.println("Number of syllables: " + syllables);

        scanner.close();
    }
}
