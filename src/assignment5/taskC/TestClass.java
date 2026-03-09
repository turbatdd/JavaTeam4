package assignment5.taskC;

import java.util.Arrays;

public class TestClass {

    static void main() {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Local class\n" + Arrays.toString(data));

        Arrays.sort(data, new DeptEmployee.LocalSort());

        System.out.println("After Local class \n" + Arrays.toString(data));
    }
}
