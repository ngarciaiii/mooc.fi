
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String reversed = "";
        for (int i = text.length() -1; i > -1; i--) {
            char letter = text.charAt(i);
            reversed = reversed + letter;
        } return reversed;
    }

//  MOOC solution:
//  public static String reverse(String text) {
//  String result = "";
//
//  int i = text.length() - 1;
//  while (i >= 0) {
//      result += text.charAt(i);  // same as result = result + text.charAt(i);
//      i--;
//  }
//
//  return result;
//	}

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
