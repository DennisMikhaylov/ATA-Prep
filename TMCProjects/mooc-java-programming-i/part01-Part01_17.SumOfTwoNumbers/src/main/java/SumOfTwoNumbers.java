import java.util.Scanner;

public class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user inputs
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        // computes and displays sum
        System.out.println("The sum of the numbers is " + (num1 + num2));

    }
}