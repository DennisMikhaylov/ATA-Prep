import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) { break; }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) { break; }

            Item item = new Item(identifier, name);

            if (!(itemList.contains(item))) {
                itemList.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item i : itemList) {
            System.out.println(i);
        }
    }
}