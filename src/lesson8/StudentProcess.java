package lesson8;

import java.util.*;

/*
// Iterator has 2 method. Iterator is top level of collection array
        - has next()
        - has
        - remove() // Also not supported

 */
public class StudentProcess {

    void main() {

        Student s1 = new Student(1, "Adam", 4.0);
        Student s2 = new Student(2, "Nami", 3.9);
        Student s3 = new Student(3, "Chopper", 3.8);
        Student s4 = new Student(4, "Luffy", 3.7);
        Student s5 = new Student(5, "Zoro", 3.6);

        List<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        // I want filter the student who got more than 3.5 GPA
        // 1. Regular approach

        System.out.println("Regular approach");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGpa() > 3.5) {
                System.out.println(list.get(i).getGpa());
            }
        }

        // 2. For each
        System.out.println("For each");

        for (Student s : list) {
            if (s.getGpa() > 3.5) {
                System.out.println(s.getGpa());
            }
        }

        // 3. Lambda approach
        System.out.println("Lambda approach");

        list.forEach(s -> {
            if (s.getGpa() > 3.5) {
                System.out.println(s.getGpa());
            }
        });

        // 4. Lambda approach
        System.out.println("Lambda approach");

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            Student s = it.next();

            if (s.getGpa() > 3.5)
                System.out.println(s.getGpa());
        }

    }
}
