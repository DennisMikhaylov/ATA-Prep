import java.lang.Math;
import java.util.Scanner;

public class NumberOfNumbers{
    public static void main(String[] args){
        // defines used variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        // repeats main logic indefinitely
        while (true) {
            System.out.println("Give a number:");

            // checks if end condition is met
            if (Integer.valueOf(scanner.nextLine()) == 0) {
                break;
            }

            // increments counts
            num++;
        }

        // prints count
        System.out.println("Number of numbers: " + num);
    }
}