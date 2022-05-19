
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money((this.euros + addition.euros), (this.cents) + (addition.cents));
    }

    public boolean lessThan(Money compared) {
        if (compared.euros > this.euros) {
            return true;
        }

        if (compared.euros == this.euros && compared.cents > this.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (cents < 0) {
            euros--;
            cents = 100 + cents;
        }

        if (euros < 0) {
            euros = 0;
            cents = 0;
        }

        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
