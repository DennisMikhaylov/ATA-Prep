
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.next());

        int ans = 1;
        for (int i = 2; i <= num; i++){
            ans *= i;
        }

        System.out.print("Factorial: " + ans);
    }
}
