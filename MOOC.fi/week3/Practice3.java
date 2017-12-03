
import java.util.Scanner;

public class Practice3{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = reader.nextLine();

		int i = name.length();
		String reversed = "";

		while(i > 0){
			char letter = name.charAt(i-1);
			reversed = reversed + letter;
			i--;
		} System.out.println("In reverse order: " + reversed);
	}
}
