/*
 * Another file Main.java used to support DecreasingCounter.java looks like this:
 *
public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();

    }
}
*
*/



public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int original;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.original = valueAtStart;

    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value != 0) {
            this.value--;
        }
    }

    // and here the rest of the methods
    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = original;
    }
}
