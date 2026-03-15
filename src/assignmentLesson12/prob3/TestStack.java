package assignmentLesson12.prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        // Basic operations (these will break when you add checks—students will add try/catch later)
        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop, peek: " + stack.peek());
        System.out.println("Stack: " + stack);


        // Uncomment later when exceptions are implemented
        // stack.push(40);            // should cause overflow
        // stack.push(null);          // should cause null not allowed
        // stack.pop(); stack.pop();  // empty now
        // stack.pop();               // should cause underflow
        // stack.peek();              // should cause underflow

        try {
            System.out.println("Push 40");
            stack.push(40);
        } catch (IllegalStateException e) {
            System.out.println("-Exception: " + e.getMessage());
        }

        try {
            System.out.println("Push null");
            stack.push(null);
        } catch (NullPointerException e) {
            System.out.println("-Exception: " + e.getMessage());
        }

        try {
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop again");
            System.out.println("Pop: " + stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("-Exception: EmptyStackException");
        }

        try {
            System.out.println("Peek again");
            System.out.println("Peek: " + stack.peek());
        } catch (EmptyStackException e) {
            System.out.println("-Exception: EmptyStackException");
        }

    }
}
