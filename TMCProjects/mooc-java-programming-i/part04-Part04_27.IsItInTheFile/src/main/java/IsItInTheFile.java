import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String search = scanner.nextLine();

        boolean contains = hasString(file, search);

        if (contains) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }

    public static boolean hasString(String file, String search) {
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                if (fileScanner.nextLine().equals(search)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        return false;
    }
}