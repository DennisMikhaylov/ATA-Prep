import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        int[] games = getNumberOfGamesPlayed(file, team);
        System.out.println("Games: " + games[0]);
        System.out.println("Wins: " + games[1]);
        System.out.println("Losses: " + games[2]);
    }

    public static int[] getNumberOfGamesPlayed(String file, String team) {
        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(",");

                if (splitLine[0].equals(team)) {
                    games++;

                    if (Integer.valueOf(splitLine[2]) > Integer.valueOf(splitLine[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (splitLine[1].equals(team)) {
                    games++;

                    if (Integer.valueOf(splitLine[3]) > Integer.valueOf(splitLine[2])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return new int[] {games, wins, losses};
    }
}