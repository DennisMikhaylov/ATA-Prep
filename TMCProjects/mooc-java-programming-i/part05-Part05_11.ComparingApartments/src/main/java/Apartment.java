import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs((this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare));
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return (this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare);
    }
}
