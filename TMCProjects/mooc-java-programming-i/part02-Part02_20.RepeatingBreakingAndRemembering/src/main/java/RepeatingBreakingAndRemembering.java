
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            sum += input;
            num++;

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num);

        double avg = (double) sum / num;
        System.out.println("Average: " + avg);

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
