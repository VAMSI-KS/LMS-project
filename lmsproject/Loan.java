import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private Book book;
    private LocalDate borrowedOn;
    private LocalDate dueDate;
    private static final int OVERDUE_FINE_PER_DAY = 2;

    // Constructors, getters, and setters
    public Loan(Book book) {
        this.book = book;
        borrowedOn = LocalDate.now();
        dueDate = borrowedOn.plusDays(14);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    // ... other getters and setters

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    public double calculateFine() {
        long overdueDays = LocalDate.now().until(dueDate, ChronoUnit.DAYS);
        return overdueDays * OVERDUE_FINE_PER_DAY;
    }
}