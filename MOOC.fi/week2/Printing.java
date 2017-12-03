
public class Printing{
	public static void main(String[] args){
		printStars(5);
		printStars(3);
		printStars(9);
		System.out.println();

		printSquare(4);
		System.out.println();

		printRectangle(17,3);
		System.out.println();

		printTriangle(4);
	}



	public static void printStars(int amount){
		while (amount > 0){
			System.out.print("*");
			amount--;
		} System.out.println();
	}

	public static void printSquare(int sideSize){
		int amount = sideSize;
		while (sideSize > 0){
			printStars(amount);
			sideSize--;
		} System.out.println();
	}

	public static void printRectangle(int width, int height){
		while (height > 0){
			printStars(width);
			height--;
		} System.out.println();
	}

	public static void printTriangle(int size) {
		int i = 0;
		while (i <= size){
			i++;
			printStars(i);
		}
	}

}
