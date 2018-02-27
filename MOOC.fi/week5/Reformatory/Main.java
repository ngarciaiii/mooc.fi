public class Main {

  public static void main(String[] args){
    //write here test code
    Reformatory reformat = new Reformatory();

    Person john = new Person("John", 1, 110, 7);
    Person doe = new Person("Doe", 33, 176, 85);

    System.out.println(john.getName() + " weight: " + reformat.weight(john) + " kilos");
    System.out.println(doe.getName() + " weight: " + reformat.weight(doe) + " kilos");

    reformat.feed(john);
    reformat.feed(john);
    reformat.feed(john);

    System.out.println(john.getName() + " weight: " + reformat.weight(john) + "kilos");
    System.out.println(john.getName() + " weight: " + reformat.weight(doe) + "kilos");

    System.out.println("total weights measured " + reformat.totalWeightsMeasured());
  }

}
