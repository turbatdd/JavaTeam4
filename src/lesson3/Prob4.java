package lesson3;

//
public class Prob4 {

    Prob4() {
    }

    public static void main(String[] args) {

//        strRev("Hello");
        int result = sumOfEven(5);

        System.out.println("result =" + result);
//        System.out.println(res);
    }


    public static int sumOfEven(int n) {
        if (n == 0) {
            return 0;
        } else {
            int i =  2 * n +1 + sumOfEven(n - 1);

//            1 + 3 + 5 + 7;

            System.out.println(i);


            return i;
        }
    }
}
