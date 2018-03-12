public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        int sumEuros = euros + added.euros;
        int sumCents = cents + added.cents;

        return new Money(sumEuros, sumCents);
    }

    public boolean less(Money compared){
        if (euros > compared.euros){
            return false;
        } else if (euros == compared.euros){
            if (cents > compared.cents){
              return false;
            }
        }
        return true
    }

    public Money minus(Money decremented){
        int sumEuros;
        int sumCents = 0;

        Money stuntMoney = new Money(euros, cents);

        if (stuntMoney.less(decremented) != true){
            sumEuros = euros - decremented.euros;
            if (cents >= decremented.cents){
              sumCents = cents - decremented.cents;
            } else {
              if (euros > 0){
                sumEuros--;
                sumCents = (cents + 100) - decremented.cents;
              }
            }
        } else {
            sumEuros = 0;
            sumCents = 0;
        }
        return new Money(sumEuros, sumCents);
    }
}
