
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int end = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int start = Integer.valueOf(scanner.next());

        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
