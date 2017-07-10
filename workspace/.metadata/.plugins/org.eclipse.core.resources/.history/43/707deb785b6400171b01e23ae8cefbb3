/*
* Another file Main.java used to support Dice.java looks like this:
* 
public class Program {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
*
*
*/

package week4;

import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int number;
    private int length;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.number = number;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String str = "";
        int i = length;
        while (i > 0) {
            number = random.nextInt(25) + 1;
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            str = str + symbol; 
//            System.out.println(str);
            i--;
        }
        return str;
    }
}
