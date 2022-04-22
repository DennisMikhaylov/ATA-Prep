import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                numList.add(num);
            }
        }

        System.out.println(numList.get(1) + numList.get(2));
    }
}