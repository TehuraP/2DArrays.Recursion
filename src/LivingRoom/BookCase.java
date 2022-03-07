package LivingRoom;

public class BookCase {
    private int shelves;
    private String genre;
    private Book[] books;

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public BookCase(int shelves, String genre, Book[] books) {
        this.shelves = shelves;
        this.genre = genre;
        this.books = books;
    }

    public void store () {
        System.out.println("I store books!");
    }
}
