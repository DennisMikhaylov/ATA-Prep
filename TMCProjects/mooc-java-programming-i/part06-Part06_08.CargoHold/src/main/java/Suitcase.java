import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxweight;

    public Suitcase(int maxweight) {
        this.items = new ArrayList<>();
        this.maxweight = maxweight;
    }


    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxweight) {
            this.items.add(item);
        }
    }

    public String toString() {
        String out = "";

        if (this.items.isEmpty()) {
            out += "no items";
        } else if (this.items.size() == 1) {
            out += "1 item";
        } else {
            out += (this.items.size() + " items");
        }

        out += (" (" + this.totalWeight() + " kg)");

        return out;
    }

    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item i : this.items) {
            sum += i.getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }

        Item heaviest = this.items.get(0);
        for (Item i : this.items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }

        return heaviest;
    }
}