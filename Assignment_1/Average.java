//4.8
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Count = 1; 
        double average;
        int sum = 0;

        for(Count = 1; Count<=10; Count++){
           System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            sum += marks;
        }
        average = (double) sum / 10;
        System.out.println("The average of the marks is: " + average);
        sc.close();
    }
}
