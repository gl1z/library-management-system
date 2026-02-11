package lms;

public abstract class User {
    private String userId;
    private String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void login() {
        System.out.println(userId + " has logged in.");
    }

    public void logout() {
        System.out.println(userId + " has logged out.");
    }

    public abstract void showMenu(); // This forces child classes to define it
}

