
import java.util.ArrayList;

public class Variance{
	public static int sum(ArrayList<Integer> list){
		int sum = 0;
		for (int num : list) {
			sum += num;
		} return sum;
	}

	public static double average(ArrayList<Integer> list){
		int i = 0;
		for(int num : list){
			i++;
		}
		double average = (1.0 * sum(list)) / i;
		return average;
	}

	public static double variance(ArrayList<Integer> list){
		double result = 0;
		double sum = 0;

		for (int num : list) {
			result = Math.pow((num - average(list)), 2);
			System.out.println(result);
			sum += result;
			System.out.println();
		}

		System.out.println(sum);
		double variance = (sum / (list.size()-1));
		return variance;
	}

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(9);
        list.add(1);
        list.add(3);
        list.add(5);

		System.out.println("The variance is: " + variance(list));

	}
}
