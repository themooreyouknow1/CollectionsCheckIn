import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    ArrayList<String> students = new ArrayList<>();

    public HandsOnArrayList() {
        students.add("Michael Jackson");
        students.add("Freddy Mercury");
        students.add("David Bowie");
        students.add("Dolly Parton");
        students.add("Elvis Presley");

        System.out.println("\nList of students: ");
        System.out.println(students);


        students.remove(0);
        System.out.println("\nList of students after removal of index 0: ");
        System.out.println(students);

        Collections.sort(students);
        System.out.println("\nList of students sorted: ");
        System.out.println(students);

    }
}
