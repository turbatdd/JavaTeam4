package march;

import java.util.*;

public class QueueApiDemo {

    void main() {

        Queue<Integer> q1 = new LinkedList<>();

        // Add or offer
        q1.add(2);
        q1.offer(3);
        q1.offer(3);
        q1.offer(3);

        // Retrieve the front data
        q1.peek(); // if empty return null
        q1.element(); // if empty return No such element exception

        // Remove(), poll()
        q1.remove();  // if empty return No such element exception
        q1.poll(); // if empty return null




        Student s1 = new Student(1, "Adam", 4.0);
        Student s2 = new Student(2, "Nami", 3.9);
        Student s3 = new Student(3, "Chopper", 3.8);
        Student s4 = new Student(4, "Luffy", 3.7);
        Student s5 = new Student(5, "Zoro", 3.6);


        // Must implement Comporator if you did not implement it it will show exception handle
        Queue<Student> sq = new PriorityQueue<>(Arrays.asList(
                s1, s2, s3, s4, s5
        ));

        Iterator it = q1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sq.forEach(s -> System.out.println(s));



    }
}
