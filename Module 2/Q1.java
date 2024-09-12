import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner number_Scanner = new Scanner(System.in);
        int number1 = number_Scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = number_Scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = number_Scanner.nextInt();

        System.out.println("The sum is " + (number1 + number2 + number3));
    }
}