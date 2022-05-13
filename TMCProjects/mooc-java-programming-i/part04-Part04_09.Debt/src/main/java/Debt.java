public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void waitOneYear() {
        this.balance *= interestRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }
}