
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());

        if (year < 2015){
            System.out.println("Ancient history!");
        }
    }
}
