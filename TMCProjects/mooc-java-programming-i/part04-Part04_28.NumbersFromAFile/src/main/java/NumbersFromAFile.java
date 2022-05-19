import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int amount = amountOfNumbers(file, lowerBound, upperBound);
        System.out.println("Numbers: " + amount);

    }

    public static int amountOfNumbers(String file, int lower, int upper) {
        int amount = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                int a = Integer.valueOf(scanner.nextLine());
                if (a >= lower && a <= upper) {
                    amount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return amount;
    }

}
