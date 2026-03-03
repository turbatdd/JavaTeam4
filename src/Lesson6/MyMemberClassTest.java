package Lesson6;

public class MyMemberClassTest {

    public static void main(String[] args) {
        MyMemberClass ob = new MyMemberClass();

        MyMemberClass.MyMemberInnerClass innerObj1 = ob.new MyMemberInnerClass();
        System.out.println("\n");

        MyMemberClass.MyMemberInnerClass innerObj2 = new MyMemberClass().new MyMemberInnerClass();
        System.out.println("\n");

        innerObj2.display();
    }
}
