
import java.util.Scanner;

public class SumOfThePowers{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.print("Type a number: ");
		int n = Integer.parseInt(reader.nextLine());
		int i = 0;
		int result;
		int sum = 0;

		while (i <= n){
			result = (int)Math.pow(2, i);
			System.out.println(result);
			sum = sum + result;
			i++;

		} System.out.print("The result is " + sum);

	}
}
