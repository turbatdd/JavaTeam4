package lesson8;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) != 0)
            return o1.getName().compareTo(o2.getName());
        else if (Double.compare(o1.getGpa(), o2.getGpa()) != 0)
            return Double.compare(o1.getGpa(), o2.getGpa());
        else
            return Integer.compare(o1.getId(), o2.getId());
    }
}
