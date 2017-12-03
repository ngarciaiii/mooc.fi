
public class PrintingLikeboss{
	public static void main(String[] args){
//		printWhitespaces(5);
//		printTriangle(4);
		xmasTree(10);
	}

	public static void printStars(int amount){
		int i = 0;
		while (i < amount){
			System.out.print("*");
			i++;
		} System.out.println();
	}

	public static void printWhitespaces(int size){
		int i = 0;
		while(i < size){
			System.out.print(" ");
			i++;
		}
	}

	public static void printTriangle(int size){
		int i = 1;
		while(i <= size){
			printWhitespaces(size - i);
			printStars(i);
			i++;
		}
	}

	public static void xmasTree(int height){
		int i = 1;

		while(i <= height){
			printWhitespaces(height - i);
			printStars(2 * i - 1);
			i++;
		}

		int tall = 2;                       // tall has to be here for this loop to work
		while (tall > 0){
			printWhitespaces(height - 2);
			printStars(3);
			tall--;
		}
	}
}
