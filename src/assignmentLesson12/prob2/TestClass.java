package assignmentLesson12.prob2;

public class TestClass {

    void main() {

        try {

            CustomerAccount c = new CustomerAccount("Turuu", "123", 200);

            int p1 = -10;
            System.out.println("Deposit amount: " + p1 + " is success: " + c.deposit(p1));

//            int p2 = 201;
//            System.out.println("Withdraw amount: " + p2 + " is success: " + c.withdraw(p2));

//            int p3 = 101;
//            System.out.println("Withdraw amount: " + p3 + " is success: " + c.withdraw(p3));
//
//            int p4 = 10;
//            System.out.println("Deposit amount: " + p4 + " is success: " + c.deposit(p4));

            System.out.println("Balance: " + c.getBalance());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
