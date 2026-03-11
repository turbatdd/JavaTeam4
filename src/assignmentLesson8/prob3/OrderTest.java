package assignmentLesson8.prob3;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)

        System.out.println("======================================================================================================");
        ArrayList<Order> aList = new ArrayList<>();
        aList.add(new Order("1001", "Abdar", 20));
        aList.add(new Order("1002", "batad", 20));
        aList.add(new Order("1003", "Turuu", 100));
        aList.add(new Order("1004", "Rahul", 40));
        aList.add(new Order("1005", "Pedro", 54));
        aList.add(new Order("1006", "Luffy", 60));
        aList.add(new Order("1007", "Jack", 10));
        aList.add(new Order("1008", "Big Mom", 80));

        System.out.println("Delete an object by instance");
        removeLastItem(aList);

        System.out.println("======================================================================================================");
        System.out.println("Size of the list: " + aList.size());

        System.out.println("======================================================================================================");
        Order selItem = getItemByIndex(aList, 3);

        System.out.println("======================================================================================================");
        Order updateItem = new Order("2001", "Turuu21", 2200);
        Order oldVal = updateItem(aList, 0, updateItem);

        System.out.println("======================================================================================================");
        Order checkOrder1 = new Order("2001", "Turuu21", 2200);
        Order checkOrder2 = new Order("2001", "Turuu21", 2200);

        System.out.println("Check equals");
        System.out.println("Check item 1 : " + checkOrder1);
        System.out.println("Check item 2 : " + checkOrder2);
        System.out.println("Is it equals: " + checkOrder1.equals(checkOrder2));

        System.out.println("======================================================================================================");
        System.out.println("Sort by totalAmount Ascending");

        System.out.println("Before sort by totalAmount: " + aList);

        // Sort by Total Amount
        aList.sort(Comparator.comparingDouble(Order::getTotalAmount));

        System.out.println("After sort by totalAmount: " + aList);
        System.out.println("======================================================================================================");
        System.out.println("Filter orders with totalAmount > 50");
        System.out.println("Before Filter: " + aList);

        List<Order> rawList = new ArrayList<Order>(aList);

        List<Order> filteredList = listMoreThan50(rawList);
        System.out.println("After Filter: " + filteredList);
    }

    public static List<Order> listMoreThan50(List<Order> list) {

        List<Order> filteredList = list.stream().filter(r -> r != null && r.getTotalAmount() > 50).collect(Collectors.toList());

        Collections.sort(filteredList, Comparator.comparing(Order::getCustomerName));

        return filteredList;
    }

    public static Order getItemByIndex(ArrayList<Order> aList, int selIndex) {
        Order selOrder = aList.get(selIndex);
        System.out.println("Selected Index " + selIndex + ", item: " + selOrder);

        return selOrder;
    }

    public static Order updateItem(ArrayList<Order> aList, int index, Order updateItem) {
        Order oldVal = aList.get(index);
        System.out.println("Update Index " + index + ", item: " + updateItem);
        System.out.println("Before update item: " + aList);
        aList.set(index, updateItem);
        System.out.println("After update item: " + aList);

        return oldVal;

    }

    public static void removeLastItem(ArrayList<Order> aList) {

        if (aList == null) {
            System.out.println("ArrayList is null could not remove");
            return;
        }

        System.out.println("Size of ArrayList : " + aList.size());
        System.out.println("Before remove last item Array List" + aList);

        aList.removeLast();

        System.out.println("Size of ArrayList : " + aList.size());
        System.out.println("After remove last item Array List" + aList);
    }
}
