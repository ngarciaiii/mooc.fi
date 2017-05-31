package week3;

import java.util.Scanner;


public class LastCharacter {
    public static char lastCharacter(String name) {
        char letter;
        letter = name.charAt(name.length()-1);
        return letter;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("Last character: " + lastCharacter(name));
        System.out.println("");
        
    }
}
