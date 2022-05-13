import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Account mattsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}