import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager Jokes = new JokeManager();

        UserInterface UI = new UserInterface(Jokes, scanner);
        UI.start();
    }
}
