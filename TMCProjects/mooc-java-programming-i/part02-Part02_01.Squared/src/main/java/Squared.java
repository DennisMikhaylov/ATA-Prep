import java.util.Scanner;

public class Squared{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // gets user input
        int num = Integer.valueOf(scanner.nextLine());

        // prints square of integer
        System.out.println(num * num);
    }
}