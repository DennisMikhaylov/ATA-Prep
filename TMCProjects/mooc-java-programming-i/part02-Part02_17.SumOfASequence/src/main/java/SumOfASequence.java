import java.util.Scanner;
// import java.lang.Math;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gets user input
        System.out.print("Last number? ");
        int num = Integer.valueOf(scanner.next());

        // performs addition
        int ans = 0;
        for (int i = num; i > 0; i--) {
            ans += (num - i + 1);
        }

        // prints answer
        System.out.println("The sum is " + ans);
    }
}