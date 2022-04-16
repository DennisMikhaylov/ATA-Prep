// import java.lang.Math;
import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sets initial count at 0
        int count = 0;

        // repeats main logic
        while (true) {
            System.out.println("Give a number:");
            // gets input
            int input = Integer.valueOf(scanner.nextLine());
            // ends counting if 0
            if (input == 0) {
                break;
            }
            // increments count if negative
            if (input < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}