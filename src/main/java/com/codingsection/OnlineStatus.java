package com.codingsection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * OnlineStatus
 *
 * A java program to counts and returns the number of users who are "online" 
 * based on user-provided input of usernames and their statuses.
 *
 * Example:
 * Input:
 *   Enter the number of people: 3
 *   Enter name: rajendran
 *   Enter status (online/offline): online
 *   Enter name: raja
 *   Enter status (online/offline): offline
 *   Enter name: shivaji
 *   Enter status (online/offline): online
 * Output: 
 *   Number of people online: 2
 *
 * Author: FAZIL ROSHAN A
 * Date: 09-07-2025
 */
public class OnlineStatus {

    /**
     * Counts how many users have the status "online".
     *
     * @param statuses a map of usernames to their status
     * @return the count of users who are online
     */
    public static int onlineCount(Map<String, String> statuses) {
        int count = 0;

        // Loop through each status in the map
        for (String status : statuses.values()) {
            if (status.equalsIgnoreCase("online")) {
                count++;
            }
        }

        return count;
    }

    /**
     * The main method that collects user input, builds the map,
     * and prints the number of people who are online.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> statuses = new HashMap<>();

        // Get the number of users to input
        System.out.print("Enter the number of people: ");
        int n = Integer.parseInt(scanner.nextLine());

        // Read each user's name and status
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter status (online/offline): ");
            String status = scanner.nextLine();

            statuses.put(name, status);
        }

        // Count and display the number of people online
        int onlineUsers = onlineCount(statuses);
        System.out.println("Number of people online: " + onlineUsers);

        scanner.close();
    }
}
