package lms;

public class Renter {
    private String renterId;
    private String name;
    private Book bookOnLoan;

    //constructor
    public Renter(String renterId, String name) {
        this.renterId = renterId;
        this.name = name;
        this.bookOnLoan = null;
    }

    // sssign a book to this renter
    public void assignBook(Book book) {
        if (bookOnLoan == null && book.isAvailable()) {
            bookOnLoan = book;
            book.lend(renterId);
            System.out.println(name + " has borrowed: " + book);
        } else {
            System.out.println(name + " already has a book or the book is unavailable.");
        }
    }

    // Return the book
    public void returnBook() {
        if (bookOnLoan != null) {
            bookOnLoan.returnBook();
            bookOnLoan = null;
            System.out.println(name + " has returned the book.");
        } else {
            System.out.println(name + " does not have any book to return.");
        }
    }

    // Show info about the renter
    public void displayInfo() {
        System.out.println("Renter ID: " + renterId);
        System.out.println("Name: " + name);
        if (bookOnLoan != null) {
            System.out.println("Currently has a book on loan.");
            bookOnLoan.displayInfo();
        } else {
            System.out.println("No book currently on loan.");
        }
    }
}

