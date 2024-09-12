
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner number_Scanner = new Scanner(System.in);
        System.out.print("Please provide your dog's age: ");

        int dog_years = number_Scanner.nextInt();
        int to_human = dog_years * 7;

        System.out.println("Your dog's age is equivalent to " + to_human + " human years.");
    }
}
