public class Book {
    private String title;
    private int pages;
    private int pubyear;

    public Book(String title, int pages, int pubyear) {
        this.title = title;
        this.pages = pages;
        this.pubyear = pubyear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPubYear() {
        return this.pubyear;
    }

    public String toString() {
        return (this.title + ", " + this.pages + " pages, " + this.pubyear);
    }
}