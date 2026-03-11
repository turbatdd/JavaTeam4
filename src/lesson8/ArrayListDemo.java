package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    void main() {

        // Default capacity 18, you can also pass the capacity
        // <Type> - Generic Type = Only accepts reference type, no primitive
//        ArrayList<int> is Wrong ArrayList<Integer>  not int use Integer

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(15);
        list1.add("hahha");
        String s = list1.get(0);

        //To achieve polymorphism - prefer super type (Future can change to Vector, LinkedList)
        List<Integer> nums = new ArrayList<>();
        nums.add(89);

        // What <> remove this happen - Raw type - All elements are object type
        List ob = new ArrayList();

        ob.add(10);
        ob.add("Hello");

        int pos0 = (int) ob.get(0); // Downcasting - Object
        Object p0 = ob.get(0);

        //var keyword - Must specify type on right side
        var list3 = new ArrayList<Integer>();


        // Define list while creating
        ArrayList<String> codeList = new ArrayList<>(Arrays.asList("Java", "C#", "Swift"));
        codeList.add("Javascript");
        System.out.println("Size = " + codeList.size());
        System.out.println(codeList);
//        codeList.add(7, "Kotlin");                                            // Error IndexOutOfIndex
        codeList.add(codeList.size() - 1, "Kotlin");              // ERROR IndexOutOfIndex
        System.out.println("Size = " + codeList.size());
        System.out.println(codeList);

//        System.out.println("Size = " + codeList.get(5));                      // ERROR Index 5 out of bounds for length 5
        System.out.println("Size = " + codeList.get(4));

        String s1 = codeList.set(0, "Java 25");
        System.out.println(s1);
        System.out.println(codeList);

        var l1 = new ArrayList<String>(Arrays.asList("Go", "NodeJS", "Swift", "TypeScript"));

        codeList.addAll(l1);

        System.out.println(codeList);

        int indOfItem = codeList.indexOf("Swift");
        boolean b = codeList.contains("Go");

        System.out.println(indOfItem);
        System.out.println(b);


        // Convert arrayList to Array
        String[] arr = codeList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        //Sorting - Collections, Binary Search

        Collections.sort(codeList);                 //Natural order
        System.out.println(codeList);

        int pos = Collections.binarySearch(codeList, "Swift");
        System.out.println("Go POS : " + pos);

        Collections.sort(codeList, Collections.reverseOrder());          // Reversed order
        System.out.println(codeList);


        pos = Collections.binarySearch(codeList, "NodeJS", Collections.reverseOrder());  // You need add Compaterer on Binary Search Collections.reverseOrder

        System.out.println("Go POS : " + pos);


    }
}
