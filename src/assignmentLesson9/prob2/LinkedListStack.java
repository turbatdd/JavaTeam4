package assignmentLesson9.prob2;

import assignmentLesson8.prob4.DoublyLinkedList;

import java.util.LinkedList;

public class LinkedListStack {
    private Node top;
    private int size;

    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    public void push(Integer x) {
        if (x == null)
            return;

        Node newNode = new Node(x);

        newNode.next = top;
        top = newNode;

        size++;
    }

    public Integer peek() {
        return top != null ? top.data : null;
    }

    public Integer pop() {
        if (top == null)
            return null;

        Integer oldVal = top.data;
        top = top.next;

        size--;
        return oldVal;
    }

    public boolean isEmpty() { // true if stack is empty
        return (top == null);
    }

    public int size() { // returns number of items in the stack
        return size;
    }

    @Override
    public String toString() {
        if (top == null)
            return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node temp = top;

        while (temp != null) {
            sb.append(temp.data);

            if (temp.next != null)
                sb.append(", ");

            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
