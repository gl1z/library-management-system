package lms;

public class SuperUser extends User {
    public SuperUser(String userId, String password) {
        super(userId, password);
    }

    @Override
    public void showMenu() {
        System.out.println("Welcome, Admin!");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Create Staff");
        System.out.println("4. List All Users");
        System.out.println("5. Logout");
    }
}
