
import java.util.ArrayList;

public class Q1 {

    public static void main(String[] args) {
        /*
        'Alan Tudyk', 
        'Steve Carell', 
        'Keira Knightley', 
        'Leonard Nimoy'
        */

        ArrayList<String> names = new ArrayList();
        names.add("Alan Tudyk");
        names.add("Steve Carell");
        names.add("Keira Knightly");
        names.add("Leonard Nimoy");

        String last = names.get(names.size() - 1);
        String second_last = names.get(names.size() - 2);

        System.out.println(last);
        System.out.println(second_last);
    }

}
