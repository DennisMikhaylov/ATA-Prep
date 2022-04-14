import java.util.Scanner;

public class IntegerInput{
    public static void main(String[] args){
        // receives input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());

        // displays user input back
        System.out.println("You gave the number " + input);
    }
}