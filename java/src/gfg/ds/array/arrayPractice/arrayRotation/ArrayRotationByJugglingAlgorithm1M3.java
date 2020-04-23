package gfg.ds.array.arrayPractice.arrayRotation;

import java.util.Scanner;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 23/04/20
 * Time Complexity:O(n)     |    Auxiliary Space:O(1)
 */
//METHOD 3
public class ArrayRotationByJugglingAlgorithm1M3 {

    public void rotateArrayByJugglingAlgorithn(int arr[],int rotationFactor) {
        int gcd = CommonMethodsForArray.gcdM1(arr.length, rotationFactor);
        for (int i = 0; i < rotationFactor; i = i + gcd) {
            arr[i] = arr[i + gcd];
        }

    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        //  ArrayRotationUsingTempArray1M1 object = new ArrayRotationUsingTempArray1M1();
        ArrayRotationByJugglingAlgorithm1M3 object = new ArrayRotationByJugglingAlgorithm1M3();
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("enter rotation factor: ");
        int rotationFactor = kb.nextInt();
        int gcd = CommonMethodsForArray.gcdM1(array.length,rotationFactor);
        object.rotateArrayByJugglingAlgorithn(array, rotationFactor);
        CommonMethodsForArray.printArray(array);
    }
}
