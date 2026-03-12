package march;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>, Comparator<Student> {
    private int id;
    private String name;
    private double gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(int id, String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) != 0)
            return o1.getName().compareTo(o2.getName());
        else if (Double.compare(o1.getGpa(), o2.getGpa()) != 0)
            return Double.compare(o1.getGpa(), o2.getGpa());
        else
            return Integer.compare(o1.getId(), o2.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id == student.id && Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
//        return name.compareTo(o.getName());
        return Integer.compare(id, o.id);
    }
}
