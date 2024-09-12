import java.util.ArrayList;

public class Q2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);

        numbers.add(2);

        numbers.add(3);

        numbers.add(4);

        int mult = 1;

        for (Integer n : numbers) {
            mult *= n;
        }

        System.out.println(mult); // 24 should be printed

    }

}