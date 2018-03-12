public class Main {
    public static void main(String[] args){
      int[] array = {5, 1, 3, 4, 2};
      printElegantly(array);

    }

    public static void printElegantly(int[] array){
      String str = "";
      for (int i = 0; i < array.length; i++) {
        if (i == array.length - 1) {
          str = str + array[i];
        } else {
          str = str + array[i] + ", ";
        }
      } System.out.println(str);
    }
}
