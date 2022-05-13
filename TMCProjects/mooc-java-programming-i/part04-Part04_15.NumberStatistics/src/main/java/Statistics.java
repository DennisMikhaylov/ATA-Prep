import java.util.ArrayList;

public class Statistics {
    // private ArrayList<Integer> nums = new ArrayList<>();
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.sum > 0) {
            return (double) this.sum / this.count;
        }
        return 0;
    }
}