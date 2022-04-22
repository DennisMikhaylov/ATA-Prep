import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int smallest = 9999;
        while (true) {
            int i = Integer.valueOf(scanner.nextLine());

            if (i == 9999) {
                break;
            }

            if (i < smallest) {
                smallest = i;
            }

            list.add(i);
        }

        System.out.println("\nSmallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}