
import java.util.Scanner;

public class UpToCertainNumber{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int start = 1;
		int num;

		System.out.print("Up to what number? ");
		num = Integer.parseInt(reader.nextLine());

		while (start <= num){
			System.out.println(start);
			start++;
		}

	}
}
