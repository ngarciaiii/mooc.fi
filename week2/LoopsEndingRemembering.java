
import java.util.Scanner;

public class LoopsEndingRemembering{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int num;
		int i = 0;
		double avg;
		int even = 0;
		int odd = 0;

		while(true){
			System.out.print("Type numbers: ");
			num = Integer.parseInt(reader.nextLine());
			if (num == -1){
				break;
			} else if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			i++;
			sum += num;
		}

		avg = (1.0* sum / i);

		System.out.println("Thank you and see you later!");
		System.out.println("The sum is: " + sum);
		System.out.println("How many numbers: " + i);
		System.out.println("Average: " + avg);
		System.out.println("Even numbers: " + even );
		System.out.println("Odd numbers: " + odd);
	}
}
