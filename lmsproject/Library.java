import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    // Methods for adding, removing, searching books and members
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; 

    }

    // ... other search methods

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public   
 Member searchMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    // ... other search methods

    public void borrowBook(Member member, Book book) {
        member.borrowBook(book);
    }

    public void returnBook(Member member, Loan loan) {
        member.returnBook(loan);
    }

    // Other methods (e.g., generateReports)
    public ArrayList<Book> getOverdueBooks() {
        ArrayList<Book> overdueBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.getOverdueLoans().isEmpty()) {
                overdueBooks.add(book);
            }
        }
        return overdueBooks;
    }
}