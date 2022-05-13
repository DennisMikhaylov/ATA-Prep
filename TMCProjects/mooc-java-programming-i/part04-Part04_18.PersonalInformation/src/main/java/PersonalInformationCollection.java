import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> pinfo = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String first = scanner.nextLine();
            if (first.isEmpty()) { break; }

            System.out.print("Last name: ");
            String last = scanner.nextLine();

            System.out.print("Identificaiton number: ");
            String id = scanner.nextLine();

            pinfo.add(new PersonalInformation(first, last, id));
        }

        System.out.println();

        for (PersonalInformation i : pinfo) {
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
    }
}