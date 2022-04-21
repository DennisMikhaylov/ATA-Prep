
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gets user input
        int num = Integer.valueOf(scanner.nextLine());

        // repeats all integers from num to 100
        for (int i = num; i <= 100; i++){
            System.out.println(i);
        }
    }
}
