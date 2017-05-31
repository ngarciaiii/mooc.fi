package week3;

import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("First character: " + firstCharacter(name));
        System.out.println();
    }
    
    public static char firstCharacter(String name) {
        char letter = name.charAt(0);
        return letter;
    }

//	  MOOC solution:     
//    public static char firstCharacter(String text) {
//        return text.charAt(0);
// 
//    }
// 
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Type your name ");
//        String name = reader.nextLine();
//        System.out.println("First character: " + firstCharacter(name));
//    }
}