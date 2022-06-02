import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container first = new Container("First");
        Container second = new Container("Second");

        while (true) {
            System.out.println(first);
            System.out.println(second);
            System.out.println();

            String input = scanner.nextLine();

            if (input.equals("quit")) { break; }

            String[] inputs = input.split(" ");

            if (inputs[0].equals("add")) {
                first.add(Integer.valueOf(inputs[1]));
            } else if (inputs[0].equals("move")) {
                second.add(first.take(Integer.valueOf(inputs[1])));
            } else if (inputs[0].equals("remove")) {
                second.take(Integer.valueOf(inputs[1]));
            }
        }
    }
}