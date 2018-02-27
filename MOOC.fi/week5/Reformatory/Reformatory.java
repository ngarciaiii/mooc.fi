public class Reformatory {
    private int count;

    public int weight (Person person) {
      count++;
      return person.getWeight();
    }

    public void feed (Person person){
      int gainWeight;
      gainWeight = person.getWeight();
      gainWeight = gainWeight + 1;
      person.setWeight(gainWeight);
    }

    public int totalWeightsMeasured(){
      return count;
    }
}
