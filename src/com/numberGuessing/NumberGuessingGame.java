package com.numberGuessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	 public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int rangeStart = 1;
	        int rangeEnd = 100;
	        int maxAttempts = 5;

	        do {
	            int randomNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
	            System.out.println("Guess the number between " + rangeStart + " and " + rangeEnd);

	            boolean guessedCorrectly = false;

	            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
	                System.out.print("Enter your guess (Attempt " + attempts + "): ");
	                int guess = scanner.nextInt();

	                if (guess == randomNumber) {
	                    System.out.println("Correct! You've guessed the number.");
	                    guessedCorrectly = true;
	                    break;
	                } else if (guess < randomNumber) {
	                    System.out.println("Opps too low.");
	                } else {
	                    System.out.println("Opps too high.");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Out of attempts! The correct number was " + randomNumber);
	            }

	            System.out.print("Wanna play again? (yes/no): ");
	        } while (scanner.next().equalsIgnoreCase("yes"));

	        System.out.println("Thanks for playing!");
	        scanner.close();
	    }
}
