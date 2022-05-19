public class Program {
    public static void main(String[] args) {
        Fitbyte newFitbyte = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = newFitbyte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }
}