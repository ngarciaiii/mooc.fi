import java.util.ArrayList;

public class Phonebook{
    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number){
        Person person = new Person(name, number);
        list.add(person);
    }

    public void printAll(){
        for (Person person : list){
          System.out.println(person);
        }
    }

    public String searchNumber(String name){
        String gotit = "";
        String noGot = "number not known";
        for (Person person : list){
            if (name.equals(person.getName())){
                gotit += person.getNumber();
            }
        }

        if (gotit == ""){
            return noGot;
        } else {
            return gotit;
        }
    }
}
