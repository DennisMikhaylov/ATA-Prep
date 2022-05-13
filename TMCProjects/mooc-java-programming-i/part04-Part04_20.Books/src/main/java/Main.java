import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) { break; }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication Year: ");
            int pubyear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, pubyear));
        }

        System.out.print("\nWhat information will be printed? ");
        String depth = scanner.nextLine();

        if (depth.equals("name")) {
            for (Book i : books) {
                System.out.println(i.getTitle());
            }
        } else if (depth.equals("everything")) {
            for (Book i : books) {
                System.out.println(i);
            }
        }
    }
}