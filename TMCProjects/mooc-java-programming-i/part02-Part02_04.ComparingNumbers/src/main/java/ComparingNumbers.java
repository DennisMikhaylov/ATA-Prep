import java.util.Scanner;

public class ComparingNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // gets user inputs
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        } else if (num2 > num1) {
            System.out.println(num2 + " is smaller than " + num1 + ".");
        } else {
            System.out.println(num1 + " is equal to " + num2 + ".");
        }
    }
}