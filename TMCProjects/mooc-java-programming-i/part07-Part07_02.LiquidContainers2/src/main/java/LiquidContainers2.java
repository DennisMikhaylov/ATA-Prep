import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second " + second);

            String input = scanner.nextLine();

            if (input.equals("quit")) { break; }

            String command = "";
            int value;
            try {
                String[] inputs = input.split(" ");
                command = inputs[0];
                value = Integer.valueOf(inputs[1]);
            } catch (Exception e){
                System.out.println("Invalid command\n");
                continue;
            }

            if (command.equals("add")) {
                first.add(value);
            } else if (command.equals("move")) {
                int most = first.contains();
                first.remove(value);

                if (most < value) {
                    second.add(most);
                } else {
                    second.add(value);
                }
            } else if (command.equals("remove")) {
                second.remove(value);
            } else {
                System.out.println("Invalid command");
            }

            System.out.println("\n");
        }
    }
}