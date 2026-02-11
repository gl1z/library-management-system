package lms;

public class LibraryApp {
    public static void main(String[] args) {
        //create users
        SuperUser admin = new SuperUser("admin1", "adminpass");
        Staff staff = new Staff("staff1", "staffpass");

        //create a renter
        Renter renter = new Renter("rent1", "Tomas");


        //create a book
        Book book = new Book("B001", "1984", "George Orwell");

        //simulate login
        admin.login();
        admin.showMenu();

        //display book info
        System.out.println("\nBook Information:");
        book.displayInfo();

        //admin lends the book to the renter
        System.out.println("\nAdmin lends book to renter:");
        renter.assignBook(book);

        //display updated book info
        System.out.println("\nUpdated Book Info:");
        book.displayInfo();

        //renter returns the book
        System.out.println("\nRenter returns the book:");
        renter.returnBook();

        //display final book info
        System.out.println("\nFinal Book Info:");
        book.displayInfo();

        //logout
        admin.logout();

    }

}
