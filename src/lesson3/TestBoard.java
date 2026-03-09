package lesson3;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class TestBoard {

    public static void main(String[] args) {
        //Creating objects;
        Board b1 = new Board();
        Board b2 = new Board(10.21, 5.14, "Green");
        Board b3 = new Board(18.32, 9.35);

        b1.display();
        b2.display();
        b3.display();

        System.out.println("area1 = " + b1.area());
        System.out.println("area2 = " + b2.area());
        System.out.println("area3 = " + b3.area());

        Board[] arr = {b1, b2, b3, new Board(32.0, 11.0, "Blue")};

        double avgP = getPeremeter(arr);
        System.out.printf("\nAvg Peremetir is : %.2f", avgP);

        LocalDate ld = LocalDate.now();

        GregorianCalendar gc = new GregorianCalendar();


//        10. Array of objects creation
//        11. Processing the collection of objects to perform some computations
    }

    public static double getPeremeter(Board[] arr) {

        if (arr.length == 0 || arr == null) {
            System.out.println("Board is null");
        }
        double tot = 0.0;
        for (int i = 0; i < arr.length; i++) {
            tot = tot + arr[i].peremeter();
        }

        System.out.printf("Tot Peremetir is : %.2f", tot);
        System.out.printf("\nAvg Peremetir is : %.2f", tot / arr.length);

        return tot / arr.length;
    }
}
