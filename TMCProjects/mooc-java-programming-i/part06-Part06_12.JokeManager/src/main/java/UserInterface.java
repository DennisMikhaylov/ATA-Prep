import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager Jokes;

    public UserInterface(JokeManager Jokes, Scanner scanner) {
        this.scanner = scanner;
        this.Jokes = Jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop\n");
            String input = this.scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.Jokes.addJoke(joke);
            } else if (input.equals("2")) {
                System.out.println("Random joke:\n" +
                        this.Jokes.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                this.Jokes.printJokes();
            } else if (input.equals("X")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
