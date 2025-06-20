package StudentApp;
public class Student_Account{
    private int pin;
    private double balance;
    private String name;
    private String email;
    private double amount;
    private double withdraw;
    private String password;
    

    public Student_Account(String name, String email) {
        this.name = name;
        this.email = email;
        this.withdraw = 0.0;
        this.balance = 0.0;
        this.pin = 0;
        this.amount = 0.0;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getPin() {
        return pin;
    }
    public double getWithdraw() {
        return withdraw;
    }
    public double getBalance() {
        return balance;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }       

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            withdraw += amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void logIn(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid email or pin.");
        }
    }
    public void logOut() {
        System.out.println("Logged out successfully.");
    }

}