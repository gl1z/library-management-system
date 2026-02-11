package lms;

public class Staff extends User {

    public Staff(String userId, String password) {
    super(userId, password);
}

    @Override
    public void showMenu() {
        System.out.println("Welcome, Staff Member!");
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.println("3. Logout");
    }
}


