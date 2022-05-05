import java.util.Scanner;
import java.util.ArrayList;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitstring = input.split(" ");

            for (String i : splitstring) {
                System.out.println(i);
            }
        }
    }
}