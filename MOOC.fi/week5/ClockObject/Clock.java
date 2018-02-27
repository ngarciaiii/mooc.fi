public class Clock{
  private BoundedCounter hours;
  private BoundedCounter minutes;
  private BoundedCounter seconds;

  public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning){
    // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    this.hours = new BoundedCounter(23);
    this.minutes = new BoundedCounter(59);
    this.seconds = new BoundedCounter(59);

    hours.setValue(hoursAtBeginning);
    minutes.setValue(minutesAtBeginning);
    seconds.setValue(secondsAtBeginning);
  }

  public void tick(){
    // Clock advances by one second
    if (seconds.getValue() == 59){
      minutes.next();
    }

    if (ssecond.getValue() == 59 && minutes.getValue() == 0) {
      hours.next();
    }

    seconds.next();
  }

  @Override
  public String toString() {
    // returns the string representation
    String clockwise = hours + ":" + minutes + ":" seconds;
    // System.out.println(clockwise);
    // return;
    return clockwise;
  }
}
