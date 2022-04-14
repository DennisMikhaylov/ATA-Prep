import java.util.Scanner;

class BooleanInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // reads user input
        System.out.println("Write something:");
        boolean input = Boolean.valueOf(scanner.nextLine());

        // displays user input
        System.out.println("True or false? " + input);
    }
}