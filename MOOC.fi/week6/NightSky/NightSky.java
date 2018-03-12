import java.util.Random;

public class NightSky{
  private double density;
  private int width;
  private int height;
  private int stars = 0;

  public NightSky(double density){
    this.density = density;
    this.width = 20;
    this.height = 10;
  }

  public Nightsky(int width, int height){
    this.density = 0.1;
    this.width = width;
    this.height = height;
  }

  public NightSky(double density, int width, int height){
    this.density = density;
    this.width = width;
    this.height = height;
  }

  public void printLine(){
    Random outerspace = new Random();

    for (int i = 0; i < this.width; i++){
      if (outerspace.nextDouble() <= this.density){
        System.out.print("*");
        stars++;
      } else {
        System.out.print(" ");
      }
    } System.out.println("");
  }

  public void print(){
    this.stars = 0;
    for (int i = 0; i < this.height; i++){
      printLine();
    }
  }

  public int starsInLastPrint(){
    return this.stars;
  }
}
