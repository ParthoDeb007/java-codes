package StudentApp;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = null;
        Student_Account account = null;
        StudentAverage average = null;
        boolean isLoggedIn = false;

        while (true) {
            if (!isLoggedIn) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Create Account");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter your ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter your password: ");
                    String password = sc.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter your department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter your batch: ");
                    String batch = sc.nextLine();

                    student = new Student(name, email, id, password, phoneNumber, dept, batch);
                    account = new Student_Account(name, email);
                    account.setPassword(password);
                    average = new StudentAverage();

                    System.out.println("\nAccount Created Successfully!");
                    student.ShowInformation();

                } else if (choice == 2) {
                    if (student == null || account == null) {
                        System.out.println("No account found. Please create an account first."); 
                    }else{
                    System.out.print("Enter your email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter your password: ");
                    String password = sc.nextLine();

                    if (account.getEmail().equals(email) && account.getPassword().equals(password)) {
                        isLoggedIn = true;
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid email or password.");
                    }
                }

                } else if (choice == 3) {
                    System.out.println("Exiting program...");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }

            } else {
                System.out.println("\n--- LOGGED IN MENU ---");
                System.out.println("1. CGPA Calculator");
                System.out.println("2. Bank Account Operations");
                System.out.println("3. Logout");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter total courses: ");
                    int totalCourses = sc.nextInt();
                    System.out.print("Enter total credit: ");
                    double totalCredit = sc.nextDouble();
                    System.out.print("Enter total completed credit: ");
                    double completedCredit = sc.nextDouble();
                    System.out.print("Enter total grade points (sum): ");
                    double sum = sc.nextDouble();

                    average.setTotal_Courses(totalCourses);
                    average.setTotal_Credit(totalCredit);
                    average.setTotal_Credit_Completed(completedCredit);
                    average.setSum(sum);
                    average.calculateCgpa();
                    average.ShowResult();

                } else if (choice == 2) {
                    System.out.println("\n--- BANK ACCOUNT ---");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.print("Choose option: ");
                    int bankChoice = sc.nextInt();

                    if (bankChoice == 1) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                    } else if (bankChoice == 2) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        account.withdraw(amount);
                    } else if (bankChoice == 3) {
                        account.checkBalance();
                    } else {
                        System.out.println("Invalid bank choice.");
                    }
                } else if (choice == 3) {
                    isLoggedIn = false;
                    System.out.println("You have been logged out.");
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
        sc.close();
    }
}
