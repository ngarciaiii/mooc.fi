import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    public MyDate currentDate;
    private int day;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        this.day = pp;
    }

    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name){
        this.name = name;
        int pp = Calendar.getInstance().get(Calendar.DATE);
        int kk = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int vv =  Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(pp, kk, vv);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int pp = Calendar.getInstance().get(Calendar.DATE);
        int kk = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int vv =  Calendar.getInstance().get(Calendar.YEAR);
        this.currentDate = new MyDate(pp, kk, vv);

        int years = this.birthday.differenceInYears(currentDate);

        return years;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.age() > compared.age()){
            return true;
        } else if (this.age() == compared.age()) {
            if (this.day > compared.day){
                return true;
            }
        } return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

}
