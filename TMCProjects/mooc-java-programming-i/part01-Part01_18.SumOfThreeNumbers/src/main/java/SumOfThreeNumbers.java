import java.util.Scanner;

public class SumOfThreeNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user inputs
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());

        // adds numbers and outputs them to user
        System.out.println("The sum of the numbers is " + (num1 + num2 + num3));
    }
}