
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = -1;
        String oldest = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) break;

            String[] splitputs = input.split(",");

            if (Integer.valueOf(splitputs[1]) > max) {
                max = Integer.valueOf(splitputs[1]);
                oldest = splitputs[0];
            }
        }
        System.out.print("Name of the oldest: " + oldest);
    }
}
