package usingScanner;

import java.util.Scanner;

public class week1_ex22 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 22
		
		while (true) {
			
			String password1 = "carrot";
			System.out.print("What is your password?: ");
			String password = reader.nextLine();
			
			if (password.equals(password1)) {
				System.out.println("Right!");
				System.out.println();
				System.out.println("The secret is: jryy qbar!");
				break;
			} else {
				System.out.println("Wrong!");
			} 
		} System.out.println("Enjoy!");
	}
}