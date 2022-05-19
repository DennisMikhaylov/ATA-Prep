
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            this.money += 2.5;
            this.affordableMeals++;
            return (payment - 2.5);
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            this.money += 4.3;
            this.heartyMeals++;
            return (payment - 4.3);
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.5)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.3)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
