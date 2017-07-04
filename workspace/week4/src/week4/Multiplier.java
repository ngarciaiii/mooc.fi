/*
 * Another file Main.java used to support Multiplier.java looks like this:
 * 
public class Main {

    public static void main(String[] args) {
        // This is an empty main method which you can use to test your class's functionality.
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}
*
*/

package week4;

public class Multiplier {
    private int num;
    
    public Multiplier(int number){
       this.num = number;
    }
    
    public int multiply(int otherNumber){
        otherNumber = num * otherNumber;
        return otherNumber;
    } 
}