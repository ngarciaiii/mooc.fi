
import java.util.Scanner;

public class Practice2{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = reader.nextLine();

		int i = 0;
		char letter;
		if (name.length() > 3) {
			while(i < 3){
				letter = name.charAt(i);
				System.out.println(i + 1 + ". characters: " + letter);
				i++;
			}
		}
	}
}
