import java.util.ArrayList;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference (Apartment otherApartment) {
        int price = this.squareMeters * this.pricePerSquareMeter;
        int otherAptPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int difference = otherAptPrice - price;
        if (difference < 0){
            difference = difference * -1;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
      int price = this.squareMeters * this.pricePerSquareMeter;
      int otherAptPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

      if (price < otherAptPrice) {
          return false;
      } else {
          return true;
      }
    }
}
