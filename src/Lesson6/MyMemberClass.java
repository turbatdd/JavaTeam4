package Lesson6;


// OUTER CLASS ONLY - PUBLIC OR DEFAULT
public class MyMemberClass {

    private String s = "Hello Member";
    private int x = 20;
    private MyMemberInnerClass ob;

    //Constructor for the outer class
    public MyMemberClass() {
        // To access Inner class from the outer class, need object
        ob = new MyMemberInnerClass();
        ob.display();
    }

    // Member Inner class - private, public, default, protected
    public class MyMemberInnerClass {
        private int num = 100;
        private String s = "Inner";

        public void display() {
            System.out.println(MyMemberClass.this.s); // If same name as inner class you can get access by just like this
            System.out.println(s); // Even private field of outer class can access
            System.out.println(num);
        }
    }
}
