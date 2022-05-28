import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) { break; }

            stack.add(input);
        }

        System.out.println(stack.values());

        stack.take();
        stack.take();

        System.out.println("\n" + stack.values());
    }
}