
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        String stars = "";
        for (int i = 0; i < array.length; i++){
            int star = 0;
            while (star < array[i]){
                System.out.print("*");
                star++;
            }
            System.out.println(stars);
        }
    }
}
