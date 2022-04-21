import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.next());

        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.next());

        int ans = 0;
        for (int i = first; i <= last; i++) {
            ans += i;
        }

        System.out.println("The sum is " + ans);
    }
}