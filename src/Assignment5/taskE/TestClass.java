package Assignment5.taskE;

import java.util.Arrays;

public class TestClass {

    static void main() {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Lambda\n" + Arrays.toString(data));

        Arrays.sort(data, (o1, o2) -> o1.getHireDate().compareTo(o2.getHireDate()));

        System.out.println("After Lambda\n" + Arrays.toString(data));
    }
}