package lesson6.sort4;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator

/**
 * Processes person data. Makes use of an external NameComparator class
 */
public class PersonData {
    public static Person[] prepareData() {
        Person[] persons =
                {new Person("Joe", "Brown", 4566.56),
                        new Person("Bob", "Roth", 3455.23),
                        new Person("Anne", "Mary", 6788.90),
                        new Person("Tim", "Cook", 2345.67),
                        new Person("Rosy", "Cook", 4567.88)};
        return persons;
    }

    public static void main(String[] args) {
        Person[] persons = prepareData();
        mySort(persons);

        System.out.println("Before Sorting: " + Arrays.toString(persons));
        System.out.println("After Sort by reversaed lname: " + Arrays.toString(persons));
    }

    public static void mySort(Person[] arr) {

        class MyLocal implements Comparator<Person> {

            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        }

        MyLocal ob = new MyLocal();
        Arrays.sort(arr, ob);
    }
}