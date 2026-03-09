package lesson4;

public class LinearSearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Object[] i = {10, 20, 15, 12, 65, 50};
        Object[] s = {"java", "c#", "SE", "UML", "WAP"};
        System.out.println("Searching of 12 in the list : " + Search(i, 50)); // 3
        System.out.println("Searching of 22 in the list : " + Search(i, 22)); // -1
        System.out.println("Searching of ASD in the list : " + Search(s, "ASD")); // -1
        System.out.println("Searching of SE in the list : " + Search(s, "SE")); //2

        // Utility Function Support from the client side - possible arguments
        System.out.println("Searching of 12 in the list : " + Search(i, 12)); // 3

    }

    public static int Search(Object[] items, Object target) {
        // invoke private method to pass all the arguments
        return Search(items, target, 0);
    }

    private static int Search(Object[] items, Object target, int posFirst) {
        if (posFirst == items.length) { // Element is not in the list or list is empty
            return -1;
        } else if (target.equals(items[posFirst])) { // Found the match
            return posFirst; // return the index
        } else {
            return Search(items, target, posFirst + 1); // recursive call
        }
    }
}
