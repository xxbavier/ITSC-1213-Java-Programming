import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        
        names.add("Grace Hopper");
        names.add("Richard Tapia");
        names.add("Timnit Gebru");
        names.add("Radia Perlman");
        names.add("Ada Lovelace");
        names.add("Ruzena Bajcsy");

        Integer count = 0;
        for (String name: names) {
            count += name.length();
        }

        System.out.println(count);
    }
}
