public class Container {
    private String name;
    private int liquid;
    private int max;

    public Container(String name) {
        this.name = name;
        this.liquid = 0;
        this.max = 100;
    }

    public void add(int add) {
        if (add > 0) {
            this.liquid += add;
        }

        if (this.liquid > this.max) {
            this.liquid = this.max;
        }
    }

    public int take(int take) {
        if (take >= this.liquid) {
            int a = this.liquid;
            this.liquid = 0;
            return a;
        } else {
            this.liquid -= take;
            return take;
        }
    }

    public String toString() {
        return (this.name + ": " + this.liquid + "/" + this.max);
    }
}