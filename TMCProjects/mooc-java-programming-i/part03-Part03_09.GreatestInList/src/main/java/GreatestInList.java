import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }

        int greatest = -1;
        for (int i : list) {
            if (i > greatest) {
                greatest = i;
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}