import java.util.ArrayList;

public class Member {
    private String name;
    private String address;
    private String contact;
    private ArrayList<Loan> loans = new ArrayList<>();

    // Constructors, getters, and setters
    public Member(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public   
 void setName(String name) {
        this.name   
 = name;
    }

    // ... other getters and setters

    public void borrowBook(Book book) {
        book.borrow();
        loans.add(new Loan(book));
    }

    public void returnBook(Loan loan) {
        loan.getBook().returnBook(loan);
        loans.remove(loan);
    }

    public double calculateOverdueFines() {
        double totalFines = 0.0;
        for (Loan loan : loans) {
            if (loan.isOverdue()) {
                totalFines += loan.calculateFine();
            }
        }
        return totalFines;
    }
}