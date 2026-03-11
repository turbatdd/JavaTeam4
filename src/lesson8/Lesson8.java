package lesson8;

import java.util.Collection;

public class Lesson8 {
    /*

    Array structure
    1. Array        -> List     -> Hashable
    2. LinkedList   -> List     -> Tree
                                -> Hashable


    How Random Access work

    Common operation
        Retrieve
        Inset
        Delete
        Find how many element from this lust
        Find if an element is in this list
        Find if this list is empty


    Contains check object s equals and hashmethod and check the Value. IF override it


    ADT – Abstract Data Type

     If i want to add already filled data how can i add to item at Index

    Anonymous Array List -- ????
    Four Ways to Initialize a List -- ?

    RandomGenerator -???

     */

    class Student {
        String arr[];               // Declare array
        int size;                   // Array Size
        final int defaultCapacity = 10;   // Default capacity
        Collection col;

        Student() {
            arr = new String[defaultCapacity];
            size = 0;
        }

        public void shift(int cap) {
            arr = new String[cap];
        }

        public void add(String s) {
//            If you call ob.add(“Java”) // End of the list
//            1. Make sure the input is null or not
//            2. Make sure is there a room to insert, if there is room add in the end, if there is no room
//            call resize() method to make room and then add the element in the end of the list.
//            3. Add the element in to the collection using size index. strArray[size] = s;
//            4. Then increment the size by 1.
        }

        public void add(String s, int pos) {

        }

        public String removeVal(String s) {
            return "";
        }

        public String removeVal(int pos) {
            return "";
        }

        public boolean isEmpty() {
            return arr == null || arr.length == 0 ? false : true;
        }

        public boolean search(String s) {
            if (isEmpty())
                return false;

            if (s == null || s.equals(""))
                return false;

            for (String s2 : arr)
                if (s2.equals(s))
                    return true;

            return false;
        }

        public String get(int i) {
            if (isEmpty())
                return null;

            if (i < 0 || i > size) // Don't check arr.length on EXAM only check avialable size of array.
                return null;

            return arr[i];
        }

        public String set(String s, int pos) {
            if (isEmpty())
                return null;

            if (s == null || pos < 0 || pos > size)
                return null;

            String oldVal = arr[pos];
            arr[pos] = s;

            return oldVal;
        }
    }


    void main() {
        Lesson8 l = new Lesson8();

    }
}


