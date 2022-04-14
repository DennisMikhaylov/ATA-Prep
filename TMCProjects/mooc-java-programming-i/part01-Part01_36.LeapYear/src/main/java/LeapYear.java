import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // gets year from user
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scanner.next());

        // checks leap year status
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("The year is not a leap year.");
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}