import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxweight;

    public Hold(int maxweight) {
        this.hold = new ArrayList<>();
        this.maxweight = maxweight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxweight) {
            this.hold.add(suitcase);
        }
    }

    public String toString() {
        return (this.hold.size() + " suitcases (" + this.totalWeight() + " kg)");
    }

    private int totalWeight() {
        int total = 0;

        for (Suitcase i : this.hold) {
            total += i.totalWeight();
        }

        return total;
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");

        for (Suitcase i : this.hold) {
            i.printItems();
        }
    }
}