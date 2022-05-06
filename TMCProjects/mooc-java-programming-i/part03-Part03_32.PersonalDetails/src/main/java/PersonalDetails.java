import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestname = "";
        int agesum = 0;
        int num = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) break;

            String[] splitputs = input.split(",");

            if (splitputs[0].length() > longestname.length()) {
                longestname = splitputs[0];
            }

            agesum += Integer.valueOf(splitputs[1]);
            num++;
        }

        System.out.println("Longest name: " + longestname);
        System.out.println("Average of the birth years: " + (double) agesum / num);
    }
}
