package week2;

import java.util.Scanner;

public class week2_ex37_38{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("How many? ");
		int i = 0;
		int num = Integer.parseInt(reader.nextLine());
		num = num - 1;
		
		while( i <= num) {
			printText();
			i++;
		}
	}
	
	public static void printText(){
		System.out.println("In the beginning there were the swamp, the hoe, and Java");
	}
}
