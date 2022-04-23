import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            nameList.add(input);
        }

        System.out.print("Search for? ");
        String lookfor = scanner.next();

        System.out.print(lookfor + " was ");
        if (!nameList.contains(lookfor)) {
            System.out.print("not ");
        }
        System.out.print("found!");
    }
}