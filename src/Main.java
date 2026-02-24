//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

//    Scanner sc = new Scanner(System.in);
//
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//
//    int max = a > b ? a : b;
//    max = max > c ? max : c;


    System.out.printf("You owe me $%5.2f \n", 195.50f);

    Scanner sc = new Scanner(System.in);

//    System.out.println("Enter sum of SQ count");
//    int i = sc.nextInt();
//    int count = 1;
//    int result = 0;
//
//    do {
//        result = count * count + result;
//
//        count++;
//    }
//    while (count <= i);


//    String name = sc.next();
//    int count = 0;
//
//    for (int i = 0; i < name.length(); i++) {
//        if (name.charAt(i) == 'e') {
//            count++;
//        }
//    }
//

//    String[] strArr = {"Tu", "Turuu2", "T3", "T4", "T5"};
//
//    for (int i = 0; i < strArr.length; i++) {
//        if (strArr[i].length() > 5)
//            System.out.println(strArr[i]);
//    }
//
//    for (String st : strArr) {
//        if (st.length() > 5)
//            System.out.println(st);
//    }

//    System.out.printf("Total sum of SQ %d", count);
//    String[] arr = name.split("");
//
//    Object[] count = Arrays.stream(name.split("")).filter(r -> r.toLowerCase().startsWith("e")).toArray();
//
//    System.out.printf("Total sum of SQ %d", count.length);

//    String str = "Hello,strings can be fun. They have many uses.";
//
//    String[] arr = str.split(",| ");
//
//    System.out.println(arr.length);
//
//    System.out.println("Array " + Arrays.toString(arr));

//    String[] st = new String[3];
//
//    String[] st1 = new String[]{"haha", "ss", "dsds"};
//
//    int[] numArr = new int[]{1, 2, 3, 4, 5};
//    myPrint(numArr);
//    myPrint(new int[]{5, 2, 10, 4, 9});


    String[] courses = {"CS390", "CS401", "CS422", "CS455", "CS501", "CS522", "CS555"};
    // Need an array only 400 level courses
    String[] arr400 = new String[3];

    //Array Copy
    System.arraycopy(courses, 1, arr400, 0, 3);
    System.out.println("400 courses System.arraycopy -  " + Arrays.toString(arr400));

    //Copy of Range
    String[] arr2400 = Arrays.copyOfRange(courses, 1, 4);
    System.out.println("400 courses CopyOfRange -  " + Arrays.toString(arr2400));

    //Clone copy deep clone
    String[] copy = courses.clone();
    System.out.println("Clone copy -  " + Arrays.toString(copy));

    //New Size
    String[] newSizedArr = Arrays.copyOf(courses, 10);
    System.out.println("newSizedArr copy -  " + Arrays.toString(newSizedArr));


}

void myPrint(int[] num) {
    System.out.println("num = " + Arrays.toString(num));
}

