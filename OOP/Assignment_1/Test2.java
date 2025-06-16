//4.5
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         
            System.out.println("Enter name for student 1:");
            String name1 = sc.nextLine();

            System.out.println("Enter roll for student 1:");
            int roll1 = Integer.parseInt(sc.nextLine());
            
            System.out.println("Enter phone for student 1:");
            String phone1 = sc.nextLine();
            
            System.out.println("Enter email for student 1:");
            String email1 = sc.nextLine();

            Student2 student_1 = new Student2(name1, roll1, phone1, email1);
            System.out.println("Enter name for student 2:");
            
            String name2 = sc.nextLine();
            System.out.println("Enter roll for student 2:");
            
            int roll2 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter phone for student 2:");
            
            String phone2 = sc.nextLine();
            System.out.println("Enter email for student 2:");
            
            String email2 = sc.nextLine();
            Student2 student_2 = new Student2(name2, roll2, phone2, email2);

            student_1.displayInformation();
            student_2.displayInformation(); 
            
            sc.close();
        }
       
    }
