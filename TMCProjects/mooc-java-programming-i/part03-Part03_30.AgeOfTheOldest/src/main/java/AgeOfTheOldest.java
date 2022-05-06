
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) break;

            String[] splitput = input.split(",");

            if (Integer.valueOf(splitput[1]) > max) {
                max = Integer.valueOf(splitput[1]);
            }
        }

        System.out.print("Age of the oldest: " + max);
    }
}
