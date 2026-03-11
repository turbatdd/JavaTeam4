package assignmentLesson8.prob4;

import lesson8.MyLL;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    // 1. Add to the end of the list
    public void addLast(String item) {

        Node newNode = new Node();
        newNode.value = item;

        Node current = header;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.previous = current;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {

        if (item == null)
            return false;

        Node current = header.next;

        while (current != null) {
            if (current.value.equals(item)) {
                current.previous.next = current.next;

                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {

        if (header.next == null)
            return false;

        Node first = header.next;

        if (first.next != null) {
            first.next.previous = header;
        }

        header.next = first.next;

        return true;
    }

    // 4. Print list from last to first
    public void printReverse() {

        if (header.next == null) {
            System.out.println("Empty list");
            return;
        }

        Node current = header.next;

        while (current.next != null) {
            current = current.next;
        }

        while (current != header) {
            System.out.print(current.value + " -> ");
            current = current.previous;
        }

        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = header.next;

        if (header.next == null) {
            return "[]";
        }

        while (current != null) {
            sb.append(current.value);
            current = current.next;

            if (current != null)
                sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Tom");
        list.addLast("Bob");
        list.addLast("Aadam");
        list.addLast("Bill");
        list.addLast("Scoot");

        System.out.println("======================================================================================================");
        System.out.println("Before addLast List: " + list);
        System.out.println("addLast(Carol)");
        list.addLast("Carol");
        System.out.println("After addLast List: " + list);

        System.out.println("======================================================================================================");
        System.out.println("Before remove Bill List: " + list);
        System.out.println("Remove Bill: " + list.remove("Bill"));
        System.out.println("After remove Bill List: " + list);


        System.out.println("======================================================================================================");
        System.out.println("Before removeFirst List: " + list);
        System.out.println("Remove First: " + list.removeFirst());
        System.out.println("After removeFirst List: " + list);


        System.out.println("======================================================================================================");
        System.out.println("Before reverse List: " + list);
        list.printReverse();
        System.out.println("After reverse List: " + list);
        System.out.println("======================================================================================================");
    }
}