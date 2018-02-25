import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        int num = 0;
        System.out.println("Type numbers: ");

        while (num >= 0){
            num = Integer.parseInt(reader.nextLine());
            if (num % 2 == 0 && num >= 0) {
                stats.addNumber(num);
                even.addNumber(num);
            } else if (num % 2 != 0 && num >= 0){
                stats.addNumber(num);
                odd.addNumber(num);
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("average: " + stats.average());
    }
}
