
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int teachers_Number = scan.nextInt();
        
        System.out.print("Enter the number of apples: ");
        int apples_Number = scan.nextInt();

        double apples_per_teacher = Math.round(apples_Number/teachers_Number);
        double apples_remaining = apples_Number%teachers_Number;

        System.out.println("Each teacher will receive " + apples_per_teacher + " apples.");
        System.out.println("Number of apples remaining in the basket is " + apples_remaining + ".");
    }
}
