import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner number_Scanner = new Scanner(System.in);
        System.out.println("Please input an integer.");

        int number = number_Scanner.nextInt();
        int prev_Number = number - 1;
        int next_Number = number + 1;

        System.err.println(prev_Number + ", " + next_Number);
    }
    
}