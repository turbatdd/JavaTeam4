package assignmentLesson8.prob1;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Add an element in last
    public void add(String s) {
        if (s == null) return;// throw new NullPointerException();
        //Check for Array is Full
        if (size == strArray.length)
            resize(); // Array is full
        // Add at the end of the list.
        strArray[size] = s;
        size++; // Increment index to insert the new elements
        // strArray[size++] = s;
    }

    public String get(int i) {
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return strArray[i];
    }

    public boolean find(String s) {
        if (s == null)
            return false;

        for (int i = 0; i < size(); i++)// for (String test: strArray)
        {
            if (s.equals(strArray[i]))
                return true;

        }
        return false; // The element is not in the list
    }

    /* 1. Using System.arrayopy()
      public void insert(String s, int pos){
         if(pos > size-1 || pos<0 )
             return;//allowed to add 0 to size-1
      if(s==null) return;
      if(pos == strArray.length) {
          resize();
       }
      String[] temp = new String[strArray.length];
       System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
        temp[pos] = s;
      System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

      strArray = temp;
      ++size;
       }
     */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
    // can insert the elements 0 to size position
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size)
            return;
        // If the array gets full
        if (size == strArray.length) {
            resize();
        }
        String[] temp = new String[strArray.length];

        for (int i = 0; i < pos; i++)
            temp[i] = strArray[i];
        temp[pos] = s;

        for (int i = pos + 1; i < size; i++)
            temp[i] = strArray[i - 1];

        strArray = temp;
        ++size;
    }

    public boolean remove(String s) {
        if (size == 0)
            return false; // the list is empty
        if (s == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (strArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false; // s is not found in the list
        String[] temp = new String[strArray.length];
        System.arraycopy(strArray, 0, temp, 0, index);
        System.arraycopy(strArray, index + 1, temp, index,
                strArray.length - (index + 1));
        strArray = temp;
        --size;
        return true;
    }

    private void resize() {
        System.out.println("resizing");
        int len = strArray.length;// Original array length
        int newlen = 2 * len; // Twice the original length
        // String[] temp = new String[newlen];
        // System.arraycopy(strArray,0,temp,0,len);
        // strArray = temp;
        strArray = Arrays.copyOf(strArray, newlen);

    }

    public String toString() {
        System.out.println("Array check");
        System.out.println("SIZEE : " + size());

        StringBuilder sb = new StringBuilder("[");

        if (size() > 0) {
            for (int i = 0; i < size - 1; ++i) {
                sb.append(strArray[i] + ", ");
            }
            sb.append(strArray[size - 1] + "]");
        } else {
            sb.append("]");
        }
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        /*
         * if(size==0) return false; else return true;
         */
        return (size == 0);
    }

    public int indexOf(String s) {
        if (strArray == null || strArray.length == 0)
            return -1;

        if (s == null)
            return -1;


        for (int i = 0; i < size(); i++)
            if (strArray[i] != null && s.equals(strArray[i]))
                return i;

        return -1;
    }

    public String removeAt(int index) {
        if (index < 0 || index > size())
            return null;

        String oldVal = strArray[index];

        for (int i = index; i < size(); i++) {
            strArray[i] = strArray[i + 1];
        }

        size--;
        return oldVal;
    }

    public void clear() {

        System.out.println("Size of array " + size());
        if (strArray != null && size() > 0)
            for (int i = 0; i < size(); i++) {
                strArray[i] = null;
            }

        if (size() != 0)
            size = 0;
    }

    public String set(int index, String s) {

        if (index < 0 || size() < index + 1)
            return null;

        String oldVal = strArray[index];

        strArray[index] = s;

        return oldVal;
    }

    public boolean containsAll(MyStringList other) {
        int count = 0;

        if (strArray == null || other == null || size() == 0 || other.strArray == null || other.size == 0)
            return false;

        for (int i = 0; i < size(); i++) {
            String selI = strArray[i];

            for (int j = 0; j < other.size(); j++) {
                String selJ = other.strArray[j];

                if (selI != null && !selI.isEmpty() && selJ != null && !selJ.isEmpty() && selI.equals(selJ)) {
                    count++;
                    break;
                }
            }
        }
        return count == other.size;

    }

    public MyStringList subList(int start, int end) {
        MyStringList sList2 = new MyStringList();

        if (start < 0 || end > size() || end < 1) {
            sList2.strArray = new String[0];
            sList2.size = 0;
        } else {
            sList2.strArray = Arrays.copyOfRange(strArray, start, end);
            sList2.size = sList2.strArray.length;
        }

        return sList2;
    }


    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        l.add("Bob");
        l.add("Steve");
        l.add("Susan");
        l.add("Mark");
        l.add("Tom");
        l.add("Jerry");

//        l.insert("Renuka", 4); // Position reached the length
//        l.insert("Mohanraj", 5); // Position reached the length
//        System.out.println(l);
//        l.add("Dave");
//        System.out.println("The list of size " + l.size() + " is " + l);
//        l.remove("Mark");
//        l.remove("Bob");
//        System.out.println("The list of size " + l.size() + " is " + l);
//        l.insert("Richard", 3);
//        System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
//        l.insert("Tonya", 0);
//        System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
//        System.out.println(l.find("Susan"));
        // String[] x = (String[]) l.clone();
        // System.out.println(Arrays.toString(x));


//        //Method 1
//        String findStr = "Tom33";
//        System.out.println("Method 1 \nSearch val: " + findStr + "\n" + Arrays.toString(l.strArray));
//        System.out.println("Index of Item : " + l.indexOf(findStr));

//        //Method 2
//        int remIndex = 2;
//        System.out.println("\nMethod 2 \nRemove index: " + remIndex + "\n" + Arrays.toString(l.strArray));
//
//        System.out.println("Removed item: " + l.removeAt(remIndex));
//        System.out.println(Arrays.toString(l.strArray));
//        System.out.println("Size of Array " + l.size());
//
//        //Method 3
//        System.out.println("\nMethod 3 \nClear():\n" + Arrays.toString(l.strArray));
//        l.clear();
//        System.out.println(l.toString());
//
//        //Method 4
//        System.out.println("\nMethod 4 Replace item by index :\n" + Arrays.toString(l.strArray));
//        int repIndex = 0;
//        String repVal = "Turuu replaced";
//        System.out.println("Index: " + repIndex + " Replace value: " + repVal + "\nResult: " + l.set(repIndex, repVal));
//        System.out.println(Arrays.toString(l.strArray));

//       //Method 5
//        System.out.println("\nMethod 5 \n Original array\n" + Arrays.toString(l.strArray));

//        MyStringList sList = new MyStringList();
//        sList.add("Tom");
//        sList.add("Bob");
//        sList.add("Susan");
//
//        System.out.println("Contains array\n" + Arrays.toString(sList.strArray));
//        System.out.println("Is it contains all : " + l.containsAll(sList));

        //Method 6
        int startIndex = 0;
        int endIndex = 7;

        var result = l.subList(startIndex, endIndex);

        System.out.println("Method 6 subList \nStart index: " + startIndex + " end index: " + endIndex + "\n" + Arrays.toString(l.strArray));
        System.out.println("SubList array : " + Arrays.toString(result.strArray));


    }
}
