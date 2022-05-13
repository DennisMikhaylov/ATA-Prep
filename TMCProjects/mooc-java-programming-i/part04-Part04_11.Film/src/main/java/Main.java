import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Film film1 = new Film("film1", 12);
        Film film2 = new Film("film2", 20);

        System.out.print("Please input your age: ");
        int age = Integer.valueOf(scanner.next());

        System.out.print("You may ");
        if (age < film1.ageRating()) {
            System.out.print("not ");
        }
        System.out.print("watch " + film1.name() + ".\n");

        System.out.print("You may ");
        if (age < film2.ageRating()) {
            System.out.print("not ");
        }
        System.out.print("watch " + film2.name());
    }
}