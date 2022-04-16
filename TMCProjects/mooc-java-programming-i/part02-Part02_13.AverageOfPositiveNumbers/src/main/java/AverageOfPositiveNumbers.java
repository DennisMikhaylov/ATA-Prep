import java.util.Scanner;
// import java.lang.Math;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // defines persistent variables
        int sum = 0;
        int count = 0;

        // repeatedly gets user inputs
        while (true) {
            // gets user input
            int input = Integer.valueOf(scanner.nextLine());

            // ends requests if user inputs 0
            if (input == 0) {
                break;
            }

            // adds total sum and increments count if input is positive
            if (input > 0) {
                sum += input;
                count++;
            }
        }

        // returns average if at least 1 positive number was entered, otherwise returns error message
        if (count > 0) {
            System.out.println((double) sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}