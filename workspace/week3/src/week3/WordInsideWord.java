package week3;


import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word1 = reader.nextLine();
        
        System.out.print("Type the second word: ");
        String word2 = reader.nextLine();
       
        int index = word1.indexOf(word2);
        if (index == -1) {
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'.");
        } else {
            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'.");
        }
    }

//	  MOOC solution:    
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Type the 1. word:");
//        String word1 = reader.nextLine();
//        System.out.print("Type the 2. word:");
//        String word2 = reader.nextLine();
// 
//        if (word1.indexOf(word2) != -1) {
//            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
//        } else {
//            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
//        }
//    }
}