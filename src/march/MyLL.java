
package march;

public class MyLL {
    Node header;

    public MyLL() {
        this.header = new Node(null);
    }

//     1. You list is empty
//     2. Your kust can have one more node

    public void addFirst1(Integer data) {
        Node nn = new Node(data);
        nn.prev = header;
        nn.next = header.next;

        if (header.next != null) {
            header.next.prev = nn;
        }

        header.next = nn;
    }

    // addFirst method
    public void addFirst2(Integer data) {
        Node nn = new Node(header, data, header.next);

        if (header.next != null) {
            header.next.prev = nn;
        }
        header.next = nn;
    }

    public boolean removeLast() {
        if (header.next == null)
            return false;
        Node current = header.next;

        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
        current = null;

        return true;
    }

    public boolean contains(Integer val) {
        if (header.next == null)
            return false;

        int sum = 0;

        for (Node cur = header.next; cur != null; cur = cur.next) {
            if (cur.data == val)
                return true;
        }

        return false; // Item not in the list
    }


    public int size() {
        if (header.next == null)
            return 0;

        int sum = 0;

        for (Node cur = header.next; cur != null; cur = cur.next) {
            sum++;
        }
        return sum;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if (header.next == null) {
            return "[]";
        } else {
            Node cur = header.next;

            while (cur != null) {

                sb.append(cur.data);
                sb.append("->");
                cur = cur.next;
            }
            sb.append("null ]");
        }
        return sb.toString();
    }
    // Node Structure - Inner class

    class Node {
        Integer data;
        Node prev;
        Node next;

        Node(Integer data) {
            this.data = data;

        }

        Node(Node prev, Integer data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}