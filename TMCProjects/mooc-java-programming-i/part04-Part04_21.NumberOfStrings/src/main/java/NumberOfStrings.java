
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        while (true) {
            if (scanner.nextLine().equals("end")) {
                break;
            } else {
                num++;
            }
        }

        System.out.println(num);
    }
}
