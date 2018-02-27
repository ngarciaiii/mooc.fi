import java.util.ArrayList;

public class NumberStatistic {
    private int amountOfNumber;
    private int sum;

    public NumberStatistic() {
        this.amountOfNumber = amountOfNumber;
        this.sum = sum;
    }

    public void addNumber(int number){
        amountOfNumber++;
        sum += number;
    }

    public int amountOfNumbers(){
        return amountOfNumber;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        if (amountOfNumber != 0) {
            double average = (1.0 * sum())/amountOfNumber;
            return average;
        } return 0;
    }
}
