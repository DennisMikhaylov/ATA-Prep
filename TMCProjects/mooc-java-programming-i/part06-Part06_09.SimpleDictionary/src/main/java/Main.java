
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI program = new TextUI(scanner, dictionary);
        program.start();
    }
}
