package assignment5.taskA;

import java.util.Comparator;

public class SortOutside implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee o1, DeptEmployee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
