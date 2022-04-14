import java.util.Scanner;

public class AdditionFormula{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user inputs
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        // outputs sum with context
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}