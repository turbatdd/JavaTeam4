package Assignment5.taskB;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    static void main() {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before Inner class\n" + Arrays.toString(data));

        TestClass t = new TestClass();
        Arrays.sort(data, t.getInner());

        System.out.println("After Inner class\n" + Arrays.toString(data));
    }

    private class InnerSort implements Comparator<DeptEmployee> {

        @Override
        public int compare(DeptEmployee o1, DeptEmployee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public InnerSort getInner() {
        return new InnerSort();
    }
}
