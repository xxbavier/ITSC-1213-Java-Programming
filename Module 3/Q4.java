import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList();

        names.add("Grace Hopper");
        names.add("Richard Tapia");
        names.add("Timnit Gebru");
        names.add("Radia Perlman");
        names.add("Ada Lovelace");
        names.add("Ruzena Bajcsy");

        ArrayList<Integer> number_of_guests = new ArrayList();
        number_of_guests.add(2);
        number_of_guests.add(3);
        number_of_guests.add(2);
        number_of_guests.add(3);
        number_of_guests.add(2);
        number_of_guests.add(2);

        for (int i=0; i < names.size(); i++) {
            String name = names.get(i);
            int number = number_of_guests.get(i);

            System.out.println(String.format("%s will be bringing %d guests.", name, number));
        }
        
    }
}
