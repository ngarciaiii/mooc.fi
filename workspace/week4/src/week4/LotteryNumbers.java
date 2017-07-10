/*
*
*

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		LotteryNumbers lotteryNumbers = new LotteryNumbers();
		ArrayList<Integer> numbers = lotteryNumbers.numbers();
		
		System.out.println("Lottery numbers: ");
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("");
}
*
*
*/

package week4;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private Random random;
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();        
        random = new Random();  
        this.drawNumbers();                             
        
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;                           
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers.clear();
        int i = 0;                                      
        int number;
        
        while (i < 7) {                                 
            number = random.nextInt(39) + 1;               
            if (!containsNumber(number)) {
               this.numbers.add(number);
               i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

