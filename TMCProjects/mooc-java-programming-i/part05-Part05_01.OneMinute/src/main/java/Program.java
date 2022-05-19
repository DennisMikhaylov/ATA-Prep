
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();

        for (int i = 0; i < 2351; i++) {
            timer.advance();
        }

        System.out.println(timer);
    }
}
