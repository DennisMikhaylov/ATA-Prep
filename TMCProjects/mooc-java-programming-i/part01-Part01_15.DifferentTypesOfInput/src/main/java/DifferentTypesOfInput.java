import java.util.Scanner;

public class DifferentTypesOfInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user inputs
        System.out.println("Give a string:");
        String inStr = scanner.nextLine();

        System.out.println("Give an integer:");
        int inInt = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double:");
        double inDoub = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean inBool = Boolean.valueOf(scanner.nextLine());

        // displays user inputs
        System.out.println("You gave the string " + inStr);
        System.out.println("You gave the integer " + inInt);
        System.out.println("You gave the double " + inDoub);
        System.out.println("You gave the boolean " + inBool);
    }
}