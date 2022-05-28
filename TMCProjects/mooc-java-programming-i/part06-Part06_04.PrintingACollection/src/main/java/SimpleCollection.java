
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String out = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            out += " is empty.";
        } else {
            out += " has " + this.elements.size() + " element";
            if (this.elements.size() > 1) {
                out += "s";
            }
            out += ":";
        }

        for (String i : this.elements) {
            out += "\n" + i;
        }
        return out;
    }
}
