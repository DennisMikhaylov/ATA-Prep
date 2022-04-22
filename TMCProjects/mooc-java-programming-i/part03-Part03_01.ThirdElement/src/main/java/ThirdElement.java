import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            nameList.add(name);
        }

        System.out.println(nameList.get(2));
    }
}