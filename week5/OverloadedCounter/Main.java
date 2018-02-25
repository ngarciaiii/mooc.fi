public class Main {
    public static void main(String[] args) {
        // write testcode here
//       Counter counter = new Counter(2, true);
//       System.out.println(counter.value());
//       counter.increase();
//       System.out.println(counter.value());
//       counter.decrease();
//       counter.decrease();

        Counter counter = new Counter(5, true);
        System.out.println(counter.value());
        counter.decrease(2);
        System.out.println(counter.value());
        counter.decrease(5);
        System.out.println(counter.value());
    }
}
