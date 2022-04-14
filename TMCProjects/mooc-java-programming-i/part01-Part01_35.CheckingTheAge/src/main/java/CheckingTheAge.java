import java.util.Scanner;

public class CheckingTheAge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user age
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        // checks age validity
        if (age >= 0 && age <= 120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}