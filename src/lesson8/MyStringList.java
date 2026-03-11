package lesson8.arraybasedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;
    Collection c;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Add an element in last
    public void add(String s) {
        if(s==null) return;// throw new NullPointerException();
        //Check for Array is Full
        if (size == strArray.length)
            resize(); // Array is full
        // Add at the end of the list.
        strArray[size] = s;
        size++; // Increment index to insert the new elements
        // strArray[size++] = s;
    }

    public String get(int i) {
        if(isEmpty()) return null;
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return strArray[i];
    }
    // contains()
    public boolean find(String s) {
        if(isEmpty()) return false;
        if (s == null)
            return false;
        for (int i = 0; i < size; i++)// for (String test: strArray)
        {
            if (s.equals(strArray[i]))
                return true;

        }
        return false; // The element is not in the list
    }

    // 1. Using System.arrayopy()
/*	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;   // allow insertion from 0 to size

		if (s == null)
			return;
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(strArray, pos, temp, pos + 1, size - pos);
		strArray = temp;
		size++;
	}*/
    // Insertion without using Temporary array
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size)
            return;   // allow insertion from 0 to size
        if (s == null)
            return;
        if (size == strArray.length) {
            resize();
        }
        for (int i = size; i > pos; i--) {
            strArray[i] = strArray[i - 1];
        }
        // Insert the new element
        strArray[pos] = s;
        size++;
    }
    // can insert the elements 0 to size position
	/*public void insert(String s, int pos) {
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

		for (int i = pos; i < size; i++)
			temp[i+1] = strArray[i];

		strArray = temp;
		++size;
	}*/

    public boolean remove(String s) {
        if (size == 0)
            return false; // the list is empty
        if (s == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (s.equals(strArray[i])) {
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
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(strArray[i] + ", ");
        }
        sb.append(strArray[size - 1] + "]");
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
    /*
     * public Object clone() {
     *
     * String[] temp = Arrays.copyOf(strArray, size); //String[] temp =
     * strArray.clone(); return temp;
     *
     * }
     */
    public MyStringList subList(int start, int end){
        end = end -1;
        if(start > end || start < 0 || start >= size || end >= size)
            return null;
        int subSize = end - start + 1;

        MyStringList myStringList = new MyStringList();
        myStringList.size = subSize;
        myStringList.strArray = new String[strArray.length];

        for(int i=start, j=0; i<=end;i++,j++){
            myStringList.strArray[j] = strArray[i];
        }
        return myStringList;
    }

    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        l.add("Bob");
        l.add("Steve");
        l.add("Susan");
        l.add("Mark");
        System.out.println(l);
        l.insert("Renuka", 2); // Position reached the length
        l.insert("Mohanraj", 5); // Position reached the length
        System.out.println(l);
        l.add("Dave");
        System.out.println(l);
        System.out.println("Sub list");
        System.out.println(l.subList(1,3));// 3 excluded
        System.out.println(l);
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Mark");
        l.remove("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.insert("Richard", 3);
        System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
        l.insert("Tonya", 0);
        System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
        System.out.println(l.find("Susan"));
        // String[] x = (String[]) l.clone();
        // System.out.println(Arrays.toString(x));
    }
}