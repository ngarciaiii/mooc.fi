
package week2;

import java.util.Random;
import java.util.Scanner;

public class week2_ex41_ghSolution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = drawNumber();

        int guesses = 0;
        int guess = 0;
        while(true) {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            
            if (guess == num) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess > num) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
        guesses++;   
        } 

        // program your solution here. Do not touch the above lines!
        
    }
	
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
