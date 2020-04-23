package gfg.ds.array.arrayPractice.arrayRotation;

import java.util.Scanner;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 24/04/20
 * Time Complexity:O(n)     |    Auxiliary Space:O(*)
 */
public class ArrayRotationByReversalAlgorithm2M4 {

    public void reverseArray(int arr[],int start, int end )// end is inclusive
    {
        int temp;
        while (start<end)
        {
            temp= arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
      //  ArrayRotationUsingTempArray1M1 object = new ArrayRotationUsingTempArray1M1();
        ArrayRotationByReversalAlgorithm2M4 object = new ArrayRotationByReversalAlgorithm2M4();
        int array[] = {1, 2, 3, 4, 5, 6,7};
        System.out.println("enter rotation factor: ");
        int rotationFactor = kb.nextInt();
        object.reverseArray(array, 0,rotationFactor-1);
        object.reverseArray(array,rotationFactor,array.length-1);
        object.reverseArray(array,0,array.length-1);

        CommonMethodsForArray.printArray(array);

        //System.out.println(array);
    }
}
