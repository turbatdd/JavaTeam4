package Assignment5.taskA;

import java.util.Arrays;

public class TestClass {

    void main() {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Outside class\n" + Arrays.toString(data));

        SortOutside s1 = new SortOutside();
        Arrays.sort(data, s1);

        System.out.println("After Outside class\n" + Arrays.toString(data));
    }
}
