/*
* Another file Main.java made and used to support BoundedCounter.java looks like this:
*

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine()); // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine()); // read the initial value of hours from the user


        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println(hours + ":" + minutes + ":" + seconds);

            if (seconds.getValue() == 59) {
                minutes.next();
            }

            if (seconds.getValue() == 59 && minutes.getValue() == 0) {
                hours.next();
            }


            seconds.next();
            i++;
        }
    }
}

*
*/


public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next(){
        if (this.value < upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString(){
        if (this.value < 10) {
            return "0"+ value;
        }
        return "" + value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int time) {
        if (time >= 0 && time <= upperLimit) {
            this.value = time;
        }
    }
}

/* BONUS // CLOCK PROGRAM //
*
*
public class Main {

        public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            if (seconds.getValue() == 59) {
                minutes.next();
            }

            if (seconds.getValue() == 59 && minutes.getValue() == 0) {
                hours.next();
            }


            seconds.next();
        }
    }
}
*
*
*/
