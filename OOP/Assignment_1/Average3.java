//5.9
import java.util.Scanner;
public class Average3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
            int cnt = 0;
            int marks = 0;
            int sum = 0;
            
            int A_count = 0;
            int B_count = 0;
            int C_count = 0;
            int D_count = 0;
            int F_count = 0;
            
            while (true) { 
                if(marks<0){
                    break;
                }
                marks = sc.nextInt();
                cnt++;


            int grade = marks / 10;
            switch (grade) {
                case 10, 9 -> {
                    A_count++;
                }
                case 8 -> {
                    B_count++;
                }
                case 7 -> {
                     C_count++;
                }
                case 6 -> {
                     D_count++;
                
                }
                case 5,4,3,2,1 -> {
                    F_count++;
                }
            }
            sum += marks;
        }
        System.out.println("Grade Report:");
        System.out.printf("Total of the %d grades entered is %d",cnt-1,sum+1);
        System.out.printf("\nAverage of the %d grades entered is %.2f", cnt-1, (double) (sum+1) / (cnt-1));
        System.out.println("\nGrade Distribution:");

        System.out.println("\nA count: " + A_count);
        System.out.println("B count: " + B_count);
        System.out.println("C count: " + C_count);
        System.out.println("D count: " + D_count);
        System.out.println("F count: " + F_count);
    }

}
