package march;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreePractice {
    void main() {

//        Set Interface -
        TreeSet<String> ob = new TreeSet<>();
        ob.add("java");
        boolean b = ob.add("Javaa");
        ob.add("JavaFX");
        ob.add("HTML");
        ob.add("Angular");
//        Sorted order
        System.out.println("Set = " + ob);

        TreeSet<Student> sset = new TreeSet<Student>();


        // TreeMap
        TreeMap<String, String> courses = new TreeMap<String, String>();

//      put(key, value);  key cannot be null, value can be null
//      Tree map auto order by natural ascending

        courses.put("CS390", "FPP");
        String val = courses.get("CS390");
        System.out.println("val: " + val);

//        Create key class, but neet comporable or comporator for the key value

    }
}
