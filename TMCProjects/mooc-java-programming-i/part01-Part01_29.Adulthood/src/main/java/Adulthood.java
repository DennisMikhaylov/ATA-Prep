import java.util.Scanner;

public class Adulthood{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user input
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        // determines adulthood status
        if (age >= 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
    }
}