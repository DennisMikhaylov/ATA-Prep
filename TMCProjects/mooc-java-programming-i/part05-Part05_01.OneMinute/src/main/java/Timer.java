public class Timer {
    private ClockHand centiseconds;
    private ClockHand seconds;

    public Timer() {
        this.centiseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.centiseconds.advance();

        if (this.centiseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        String first = "" + this.seconds.value();
        String second = "" + this.centiseconds.value();
        if (this.seconds.value() < 10) {
            first = "0" + first;
        }
        if (this.centiseconds.value() < 10) {
            second = "0" + second;
        }
        return (first + ":" + second);
    }
}