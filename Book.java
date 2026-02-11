package lms;

public class Book {
    // fields to store book details and status
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    private String borrowerId;

    // constructor t initialize a new book
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, book is available
        this.borrowerId = null;
    }

    //method to check if the book is available for borrowing
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to lend the book to a borrower
    public void lend(String borrowerId) {
        if (isAvailable) {
            this.borrowerId = borrowerId;
            isAvailable = false;
            System.out.println("Book lent to: " + borrowerId);
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    // method to return the book
    public void returnBook() {
        if (!isAvailable) {
            System.out.println("Book returned from: " + borrowerId);
            borrowerId = null;
            isAvailable = true;
        } else {
            System.out.println("Book was not on loan.");
        }
    }

    // Method to display all book information
    public void displayInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        if (!isAvailable) {
            System.out.println("Borrowed by: " + borrowerId);
        }
    }
}


