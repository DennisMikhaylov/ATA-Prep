public class Main {
    public static void main(String[] args) {
        Debt testDebt = new Debt(1000, 1.02);

        testDebt.printBalance();

        testDebt.waitOneYear();
        testDebt.printBalance();
    }
}