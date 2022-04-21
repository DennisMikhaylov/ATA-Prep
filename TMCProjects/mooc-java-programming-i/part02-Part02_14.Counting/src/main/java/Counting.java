import java.util.Scanner;
import java.lang.Math;

public class Counting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // gets user input
        int num = Integer.valueOf(scanner.nextLine());

        // repeats num number of times
        for (int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
}