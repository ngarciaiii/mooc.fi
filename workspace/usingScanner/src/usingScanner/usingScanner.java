package usingScanner;

import java.util.Scanner;

public class usingScanner {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
			
		System.out.print("What is your name?");
		String name = reader.nextLine(); //Reads a line of input from user and assign it to a variable called name 
		
		System.out.println("Hi " + name);	
		}
}
