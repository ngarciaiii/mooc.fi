package usingScanner;

import java.util.Scanner;

public class week1_ex19_21 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 19
		System.out.print("How old are you?: ");
		int age = Integer.parseInt(reader.nextLine());
		
		if (age > 0 && age < 121) {
			System.out.println("Good age!");
		} else {
			System.out.println("Impossible!");
		}
		
		System.out.println();
		
		//EXERCISE 20
		
		String username1 = "alex";
		String password1 = "mightyduck";
		
		String username2 = "emily";
		String password2 = "cat";
		

		System.out.print("What is your username?: ");
		String username = reader.nextLine();
		System.out.print("What is your password?: ");
		String password = reader.nextLine();
		
		
		if (username.equals(username1) && password.equals(password1)) {
			System.out.println("You are now logged in!");
		} else if (username.equals(username2) && password.equals(password2)) {
			System.out.println("You are now logged in!");
		} else {
			System.out.println("Your username or password is invald.");
		}
		
		//EXERCISE 21
		
		
		
		System.out.println();
		
		System.out.print("Enter the year: ");
		int year = Integer.parseInt(reader.nextLine());
	
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("It is a leap year!");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("It is a leap year!");
		} else {
			System.out.println("It is NOT a leap year.");
		}
	}
}

		
		