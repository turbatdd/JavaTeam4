package assignmentLesson11.prob1;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        //implement

        if (students == null)
            return null;

        HashMap<Key, Student> hm = new HashMap<>();

        for (Student s : students) {
            if (s.getFirstName() != null && s.getLastName() != null
                    && !s.getFirstName().isEmpty() && !s.getLastName().isEmpty()) {
                hm.put(new Key(s.getFirstName(), s.getLastName()), s);
            }
        }

        return hm;
    }
}
