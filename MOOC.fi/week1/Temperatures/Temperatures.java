import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
         while(true) {
            System.out.print("Enter a temperature between -30 and 40: ");
            double value = Double.parseDouble(reader.nextLine());


            if (value > -31 && value < 41) {
                Graph.addNumber(value);
            } else {
                System.out.println("Value is outside the range");
            }
        }
    }
}
