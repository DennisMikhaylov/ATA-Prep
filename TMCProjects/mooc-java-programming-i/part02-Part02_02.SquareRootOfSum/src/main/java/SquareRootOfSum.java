import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // gets user input
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        // performs operation
        double ans = Math.sqrt(num1 + num2);

        // displays result
        System.out.println(ans);
    }
}

