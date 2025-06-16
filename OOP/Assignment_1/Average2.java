//4.10
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int marks;
            double average;
            int sum = 0;
            int count = 0;
            while (true) {
                System.out.println("Enter grade or -1 to quit: ");
                marks = sc.nextInt();
                if (marks == -1) {
                    break;
                }
                sum += marks;
                count++;
            }
            if (count > 0) {
                average = (double) sum / count;
                System.out.printf("Total of the %d grades entered is %d\n", count, sum);
                System.out.printf("Class average is %.2f\n", average);
            } else {
                System.out.println("No grades were entered.");
            }
            sc.close();
        }
    }

