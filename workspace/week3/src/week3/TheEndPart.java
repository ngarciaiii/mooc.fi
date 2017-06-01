package week3;

import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
//        System.out.print(word.length());
        
        System.out.print("Length of the end part: ");
        int i = Integer.parseInt(reader.nextLine());
        
        int j = word.length() - i;
//        System.out.println(j);
        
        System.out.println("Result: " + word.substring(j));
    }

//	  MOOC Solution:    
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Type a word: ");
//        String word = reader.nextLine();
//        System.out.print("Length of the end part:  ");
//        int lengthOfEnd = Integer.parseInt(reader.nextLine());
//         
//        int startingPosition = word.length() - lengthOfEnd;
//        System.out.print("Result: " + word.substring(startingPosition, word.length()));
//    }
}