public class Book {

    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private int copiesAvailable;

    public Book(String title, String author, String ISBN, String genre, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.copiesAvailable = copiesAvailable;
    }

    // Getters for all attributes (omitted for brevity)

    public boolean isAvailable() {
        return copiesAvailable > 0;
    }

    public void borrow() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook() {
        if (copiesAvailable < 0) {
            System.out.println("Error: Book was already returned or record is inconsistent.");
        } else {
            copiesAvailable++;
        }
    }
}