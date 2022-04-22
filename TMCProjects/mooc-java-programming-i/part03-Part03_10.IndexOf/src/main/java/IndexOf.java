
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.print("Search for? ");
        int target = Integer.valueOf(scanner.next());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                System.out.println(target + " is at index " + i);
            }
        }
    }
}
