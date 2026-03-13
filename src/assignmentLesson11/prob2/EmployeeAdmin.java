package assignmentLesson11.prob2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    /**
     * Your method prepareReport should return a list of all Employees in the input table
     * whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     * In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        //IMPLEMENT

        if (table == null || socSecNums == null)
            return null;

        List<Employee> list = new ArrayList<>();

        for (String s : socSecNums) {
            if (!s.isEmpty()) {
                Employee e = table.get(s);

                if (e != null && e.getSalary() > 80000)
                    list.add(table.get(s));
            }
        }


        list.sort(Comparator.comparing(Employee::getSsn));
        return list;
    }

}
