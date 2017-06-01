package week3;

import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        for (int i = name.length() -1; i > -1; i--) {
            char letter = name.charAt(i);
            System.out.print(letter);
        }
    }

//	  MOOC solution:     
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Type your name: ");
//        String name = reader.nextLine();
//        System.out.print("In reverse order: ");
//         
//        int i = name.length() - 1;
//        while (i >= 0) {
//            System.out.print(name.charAt(i));
//            i--;
//        }
//        System.out.println("");
//    }   
}
