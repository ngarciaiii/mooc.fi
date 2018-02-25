public class CashRegister {

    private double cashInRegister;
    private int economicalSold = 0;
    private int gourmetSold = 0;

    public CashRegister() {
        // at start the register has 1000 euros
       this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        // if not enough money given, all is returned and nothing else happens

        this.economicalSold++;

        if (cashGiven >= 2.5){
            this.cashInRegister += 2.5;
            return cashGiven - 2.5;
        } else {
            this.economicalSold--;
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        // if not enough money given, all is returned and nothing else happens
        this.gourmetSold++;

        if (cashGiven >= 4){
            this.cashInRegister += 4;
            return cashGiven - 4;
        } else {
            this.gourmetSold--;
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card){
        this.economicalSold++;

        if (card.balance() >= 2.5){
            card.pay(2.5);
            return true;
        } else {
            this.economicalSold--;
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card){
        this.gourmetSold++;

        if (card.balance() >= 4){
            card.pay(4);
            return true;
        } else {
            this.gourmetSold--;
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if (sum > 0){
            card.loadMoney(sum);
            this.cashInRegister = this.cashInRegister + sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
