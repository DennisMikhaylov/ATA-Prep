import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) { break; }

            items.add(new Item(input));
        }

        for (Item i : items) {
            System.out.println(i);
        }
    }
}