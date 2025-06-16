package Project;

public class Account {

    public String name;
    public String email;
    private String password;
    private String phoneNumber;
    private int PIN;
    private double balance;

    public Account(String name, String email, String password, String phoneNumber, int PIN) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.PIN = PIN;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean logIn(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void logOut() {
        System.out.println("Logged out successfully.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
