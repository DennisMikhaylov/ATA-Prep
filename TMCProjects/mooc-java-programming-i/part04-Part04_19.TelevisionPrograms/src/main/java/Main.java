import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) { break; }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("\nProgram's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram i : programs) {
            if (i.getDuration() <= max) {
                System.out.println(i);
            }
        }
    }
}