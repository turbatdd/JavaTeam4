package Assignment5.taskD;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    static void main() {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Anonymous\n" + Arrays.toString(data));

        Arrays.sort(data, new Comparator<DeptEmployee>() {
            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        System.out.println("After Anonymous\n" + Arrays.toString(data));
    }
}
