package week3;

import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println(i + 1 + ". character: " + letter);
        } 

//	  MOOC solution:         
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Type your name: ");
//        String name = reader.nextLine();
//         
//        int i = 0;
//        while (i < name.length()) {
//            System.out.println((i + 1) + ". character: " + name.charAt(i));
//            i++;
//        }
//    }  
    }
}