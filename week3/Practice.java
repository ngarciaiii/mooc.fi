
import java.util.Scanner;

public class Practice{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = reader.nextLine();

		int i = 0;
		while(i < name.length()){
			char letter = name.charAt(i);
			System.out.println(i + 1 + ". characters: " + letter);
			i++;
		}
	}
}
