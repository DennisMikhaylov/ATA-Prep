
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edgeLength = Integer.valueOf(scanner.nextLine());

        Cube newCube = new Cube(edgeLength);
        System.out.println(newCube);
    }
}
