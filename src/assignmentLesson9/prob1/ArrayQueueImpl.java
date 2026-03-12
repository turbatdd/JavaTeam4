package assignmentLesson9.prob1;

import assignmentLesson8.prob4.DoublyLinkedList;

import java.util.Arrays;

public class ArrayQueueImpl {

    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields

    ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = -1;
    }

    ArrayQueueImpl(int capacity) {
        arr = new Integer[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public Integer peek() {
//implement
        if (isEmpty())
            return null;
        return arr[front];
    }

    public void enqueue(int obj) {
//implement
        if (size() == arr.length)
            resize();

        rear = (rear + 1) % arr.length;
        arr[rear] = obj;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty())
            return null;

        int oldVal = arr[front];

        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;

        return oldVal;
    }

    public boolean isEmpty() {
//implement
        return size == 0;
    }

    public int size() {
//implement
        return size;
    }

    private void resize() {
//implement
        System.out.println("resizing");

        int newlen = 2 * arr.length;
        Integer[] newArr = new Integer[newlen];

        for (int i = 0; i < size; i++)
            newArr[i] = arr[(front + i) % arr.length];

        arr = newArr;
        front = 0;
        rear = size - 1;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[(front + i) % arr.length]);
            if (i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
