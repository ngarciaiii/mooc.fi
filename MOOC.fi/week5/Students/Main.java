import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        // Student new Student = new Student (name.nextLine(), id.nextLine());

        // Student pekka = new Student ("Pekka Mikkola", "013141590");
        // System.out.println("name: " + pekka.getName());
        // System.out.println("studentnumber: " + pekka.getStudentNumber);
        // System.out.println(pekka);

        System.out.println("Type your name");

        while(true){
          System.out.print("name: ");
          String name = reader.nextLine();
              if (name.isEmpty()){
                  System.out.println("");
                  break;
              }
          System.out.print("studentnumber: ");
          String studentnumber = reader.nextLine();
          Student newStudent = new Student(name, studentnumber);
          list.add(newStudent);
        }

        for (Student newStudent : list) {
            System.out.println(newStudent);
        }

        System.out.println("");
        System.out.print("Give a search term: ");
        String find = reader.nextLine();

        System.out.println("Result: ");

        for (Student newStudent : list) {
            if (newStudent.getName().contains(find)){
                System.out.println(newStudent);
            }
        }
    }
}
