import java.util.Scanner;

class DoubleInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user input
        System.out.println("Give a number:");
        double input = Double.valueOf(scanner.nextLine());

        // displays user input
        System.out.println("You gave the number " + input);
    }
}