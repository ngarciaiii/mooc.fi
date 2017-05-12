package week2;

import java.util.Scanner;

public class week2_ex41{
	
	// Generates random number
	public static int drawNumber() {
		int num =(int )(Math.random() * 100 + 1); 
		System.out.println(num);
		return num;
	}
	
	// Read user's guess
	public static int guess() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Guess a number: ");
		int guess = Integer.parseInt(reader.nextLine());
		return guess;
	}
	
	// Check guess against given number 
	public static boolean checkGuess(int guess, int num) {
		if (guess == num) {
			System.out.println("You have guessed it!");
			return true;
		} else if (guess > num) {
			System.out.println("The guessing number is greater.");
			return false;
		} else {
			System.out.println("The guessing number is lesser.");
			return false;
		}
	}
	
	// Run program
	public static void main(String[] args){
		int num = drawNumber();
		System.out.println();
		int guesses = 5;
		while(guesses > 0) {
			int guess = guess();
			boolean correct = checkGuess(guess, num);
			if (correct) {
				break;
			}
			
			guesses--;
			System.out.println("You have " + guesses + " guesses left");
			System.out.println("Try again!");
			System.out.println();
		}
	}
}