package usingScanner;

import java.util.Scanner;

public class week1_ex08_12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());	

		int addAns = num1 + num2;
		
		double divAns = (double) num1 / num2;  //important to convert int into float by using (double)!!
		
		System.out.println("Sum of the numbers: " + addAns);
		System.out.println("Division: " + divAns + System.lineSeparator());
		
		System.out.print("Type the radius: ");
		double radius = Double.parseDouble(reader.nextLine());
		
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("Circumference of the circle: " + circumference + System.lineSeparator());
		
		
		System.out.print("Type a number: ");
		int a = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number: ");
		int b = Integer.parseInt(reader.nextLine());
		
		if (a > b) {
			System.out.println("The bigger number of the two numbers given was: " + a + System.lineSeparator());
		} else {
			System.out.println("The bigger number of the two numbers given was: " + b + System.lineSeparator());				
		}
		
		System.out.print("Type your name: ");
		String name1 = reader.nextLine();
		
		System.out.print("Type your age: ");
		int age1 = Integer.parseInt(reader.nextLine());
	
		System.out.print("Type your name: ");
		String name2= reader.nextLine();
		
		System.out.print("Type your age: ");
		int age2 = Integer.parseInt(reader.nextLine());
		
		System.out.println(System.lineSeparator() + name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");
		
	}
}