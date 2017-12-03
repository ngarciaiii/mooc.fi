/*
 * Another file Main.java used to support Product.java looks like this:
 *
 public class Main {
    public static void main(String[] args) {
        // You can test your new class here, try e.g.:

         Product t = new Product("Banana", 1.1, 13);
         t.printProduct();
    }
 }
 */


public class Product {
    private double price;
    private int amount;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.price = priceAtStart;
        this.amount = amountAtStart;
        this.name = nameAtStart;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
