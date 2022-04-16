import java.util.Scanner;
// import java.util.Math;

public class AbsoluteValue{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // gets user input
        int num = Integer.valueOf(scanner.nextLine());

        // performs operation
        if (num < 0) {
            num *= -1;
        }

        // displays num
        System.out.println(num);
    }
}