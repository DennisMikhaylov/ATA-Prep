import java.util.Scanner;
public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.list.add(task);
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int removedtask = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(removedtask);
            }
        }
    }
}
