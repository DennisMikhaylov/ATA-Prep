
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
