package assignmentLesson9.prob3;

public class LinkedListStack {
    private Node top;
    private int size;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public void push(String x) {
        if (x == null)
            return;

        Node newNode = new Node(x);

        newNode.next = top;
        top = newNode;

        size++;
    }

    public String peek() {
        return top != null ? top.data : null;
    }

    public String pop() {
        if (top == null)
            return null;

        String oldVal = top.data;
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
        if (top == null) return "[]";

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
