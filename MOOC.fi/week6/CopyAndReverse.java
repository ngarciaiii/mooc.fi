import java.util.Arrays;

public class Main {
    public static void main(String[] args){
      int[] original = {1, 2, 3, 4};
      int[] copied = copy(original);
      int[] reverse = reverseCopy(original);

      copied[0] = 99;

      System.out.println( "original: " + Arrays.toString(original));
      System.out.println( "copied: " + Arrays.toString(copied));
      System.out.println( "reversed: " + Arrays.toString(reverse));

    }

    public static int[] copy(int[] array){
      int[] changed = array.clone();
      return changed;
    }

    public static int[] reverseCopy(int[] array){
      System.out.println(array.length);
      int[] reversed = new int[array.length];

      for(int i = 0; i < array.length; i++){
        reversed[i] = array[array.length-1-i];
        // System.out.println(reversed[i]);
      }

      return reversed;
    }
}
