public class Container {
    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquid += amount;
        }

        if (this.liquid > 100) {
            this.liquid = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquid -= amount;
        }

        if (this.liquid < 0) {
            this.liquid = 0;
        }
    }

    public String toString() {
        return (liquid + "/100");
    }
}