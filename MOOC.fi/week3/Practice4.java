
import java.util.ArrayList;
import java.util.Scanner;

public class Practice4{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();

		while(true){
			System.out.print("Type a word: ");
			String word = reader.nextLine();

			if (!word.isEmpty()){
				words.add(word);
			} else {
				break;
			}
		}
	}
}
