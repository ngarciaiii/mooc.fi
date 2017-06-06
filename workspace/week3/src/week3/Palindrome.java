package week3;

import java.util.Scanner;

public class Palindrome{
	public static boolean palindrome(String text){
		
		String reversed = "";
		for (int i = text.length() -1; i > -1; i--) {
			char letter = text.charAt(i);
			reversed = reversed + letter;
		}
		
		if (text.equals(reversed)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a text: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
		
	}
}