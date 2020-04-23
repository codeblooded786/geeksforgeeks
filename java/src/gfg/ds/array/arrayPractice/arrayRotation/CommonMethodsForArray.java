package gfg.ds.array.arrayPractice.arrayRotation;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 23/04/20
 */

public class CommonMethodsForArray {

    public static void printArray(int arr[]) {
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

//    An efficient solution is to use Euclidean algorithm which is the main algorithm used for this
//    purpose. The idea is, GCD of two numbers doesn’t change if smaller number is subtracted from
//    a bigger number.


    public static int gcdM1(int a, int b) {
        if (b == 0) return a;
        return gcdM1(b, a % b);
    }

    public static int gcdM2(int a, int b) {
//        if (a == 0)
//            return b;
//        while (b != 0) {
//            if (a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//        return a;
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
