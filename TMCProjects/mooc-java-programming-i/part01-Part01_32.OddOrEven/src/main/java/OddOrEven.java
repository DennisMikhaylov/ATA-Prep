
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());

        if (num % 2 == 0){
            System.out.println("Number " + num + " is even");
        }else{
            System.out.println("Number " + num + " is odd");
        }
    }
}
