package assignmentLesson9.prob2;

public class Prob2Test {

    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push(1);
        System.out.println("Push : 1 stack: " + st);
        st.push(2);
        System.out.println("Push : 2 stack: " + st);
        System.out.println("Size = " + st.size());
        System.out.println("Is Empty: " + st.isEmpty());
        st.pop();
        System.out.println("Pop  stack: " + st);
        st.pop();
        System.out.println("Pop  stack: " + st);
        System.out.println("Stack: " + st);

    }
}
