package march;

public class MyLLTest {

    void main() {
        MyLL ll = new MyLL();
        ll.addFirst1(20);
        ll.addFirst1(30);
        ll.addFirst1(40);
        ll.addFirst1(10);
        ll.addFirst2(12);

        System.out.println(ll);


        System.out.println("Count : " + ll.size());

        System.out.println("contains : " + ll.contains(20));

        ll.removeLast();
        System.out.println(ll);



    }

}
