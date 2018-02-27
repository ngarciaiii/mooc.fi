public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;

    public BoundedCounter (int upperLimit){
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next(){
      if (this.value < upperLimit){
        this.value++;
      } else {
        this.value = 0;
      }
    }

    @Override
    public String toString(){
      if (this.value < 10){
        return "0" + value;
      }
      return "" + value;
    }

    public int getValue(){
      return this.value;
    }

    public void setValue(int time){
      if (time > 0 && time <= upperLimit){
        this.value = time;
      }
    }
}
