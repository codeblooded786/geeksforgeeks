package gfg.ds.array.arrayPractice.arrayRotation;

import java.util.Scanner;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 23/04/20
 * Time complexity:O(n)     |   Auxiliary Space:O(n)
 */
//METHOD 1
public class ArrayRotationUsingTempArray1M1 {

    public void rotateBy(int arr[], int rotationFactor) {
        int tempArray[] = new int[rotationFactor];

        for (int i = 0; i < rotationFactor; i++) {
            tempArray[i] = arr[i];
        }
        int i;
        for (i = 0; i < arr.length - rotationFactor; i++) {
            arr[i] = arr[i + rotationFactor];
        }
        for (int j = 0; j < rotationFactor; j++) {
            arr[i++] = tempArray[j];
        }
        return;
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        ArrayRotationUsingTempArray1M1 object = new ArrayRotationUsingTempArray1M1();
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("enter rotation factor: ");
        int rotationFactor = kb.nextInt();
        object.rotateBy(array, rotationFactor);
        CommonMethodsForArray.printArray(array);

        //System.out.println(array);
    }
}
