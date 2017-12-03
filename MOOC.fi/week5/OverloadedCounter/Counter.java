public class Counter {
    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }

    public Counter(boolean check){
        this.startingValue = 0;
        this.check = check;
    }

    public Counter(){
        this.startingValue = 0;
        this.check = false;

    }

    public int value(){
        return this.startingValue;
    }

//    public void increase(){
//        this.startingValue++;
//    }
//
//    public void decrease(){
//        if (this.check == true){
//            if (this.startingValue > 0){
//                this.startingValue--;
//            } else {
//                this.startingValue = 0;
//            }
//        } else {
//            this.startingValue--;
//        }
//    }

    public void increase(int increaseAmount){
        this.startingValue = this.startingValue + increaseAmount;
    }

    public void decrease(int decreaseAmount){
        this.startingValue = this.startingValue - decreaseAmount;
        if (this.startingValue < 0){
            this.startingValue = 0;
        }
    }
}
