package march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentTest {

    void main() {
        //Create 5 student object and store into ArrayList

        Student s1 = new Student(1, "Adam", 4.0);
        Student s2 = new Student(2, "Nami", 3.9);
        Student s3 = new Student(3, "Chopper", 3.8);
        Student s4 = new Student(4, "Luffy", 3.7);
        Student s5 = new Student(5, "Zoro", 3.6);

        ArrayList<Student> sList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        for (Student s : sList) {
            System.out.println(s);
        }

        System.out.println("Size = " + sList.size());

        Student look = new Student(2, "Turuu2", 3.9);

        boolean b = sList.contains(look);

        System.out.println(b);

        Collections.sort(sList);

        System.out.println("Before SORT");
        sList.forEach(a -> System.out.println(a));

        // Comparator consists equal
        // equals method says true if all the fields status are same
        // Same way your comparator must check all the fields

//        Collections.sort(sList, Comparator.comparing(Student::getName) // Primary key
//                .thenComparing(Student::getGpa)                        // Second key 1
//                .thenComparing(Student::getId));                       // Second key 2

        Collections.sort(sList, new StudentComparator());

        System.out.println("After SORT");
        sList.forEach(a -> System.out.println(a));
    }
}
