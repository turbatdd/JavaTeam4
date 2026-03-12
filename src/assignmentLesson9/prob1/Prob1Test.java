package assignmentLesson9.prob1;

public class Prob1Test {

    public static void main(String[] args) {
        ArrayQueueImpl q1 = new ArrayQueueImpl(5);

        System.out.println("Queue: " + q1);
        q1.enqueue(5);
        System.out.println("Enqueue: 5 Queue: " + q1);
        q1.enqueue(20);
        System.out.println("Enqueue: 20 Queue: " + q1);
        q1.enqueue(25);
        q1.enqueue(15);
        System.out.println("Enqueue: 15 Queue: " + q1);
        q1.enqueue(80);
        System.out.println("Enqueue: 80 Queue: " + q1);
        System.out.println("Enqueue: 25 Queue: " + q1);
        q1.enqueue(10);
        System.out.println("Enqueue: 10 Queue: " + q1);
        System.out.println("Peek: " + q1.peek() + " Queue: " + q1);
        System.out.println("Dequeue: " + q1.dequeue() + " Queue: " + q1);
        System.out.println("Dequeue: " + q1.dequeue() + " Queue: " + q1);
        q1.enqueue(6);
        System.out.println("Enqueue: 6 Queue: " + q1);
        q1.enqueue(3);
        System.out.println("Enqueue: 3 Queue: " + q1);
        System.out.println("Size: " + q1.size());
    }
}
