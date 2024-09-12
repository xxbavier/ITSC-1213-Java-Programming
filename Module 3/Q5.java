
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.err.println("Enter a number.");
        int number = scnr.nextInt();

        if (number % 2 == 0) {
            System.err.println("The number you entered is even.");
        } else if (number % 2 == 1) {
            System.err.println("The number you entered is odd.");
        }
    }
}
