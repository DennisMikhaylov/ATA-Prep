import java.util.Scanner;
// import java.lang.Math;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // defines persistent ints
        int sum = 0;
        int count = 0;

        // repeats user requests indefinitely
        while (true) {
            // gets user input
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            // terminates if input is 0
            if (input == 0) {
                break;
            }

            // adds input to total sum and increments count by 1
            sum += input;
            count++;
        }

        // performs average calculation
        double average = (double) sum / count;

        // outputs result
        System.out.println("Average of the numbers: " + average);
    }
}