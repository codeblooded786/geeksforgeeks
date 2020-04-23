package gfg.ds.array.arrayPractice.arrayRotation;

import java.util.Scanner;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 23/04/20
 * Time complexity:O(n*d)     |   Auxiliary Space:O(1)
 */

//METHOD 2
public class ArrayRotationOneByOne1M2 {

    public void rotateArrayOneByOne(int arr[]) {
        int temp = arr[0], i;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        ArrayRotationOneByOne1M2 object = new ArrayRotationOneByOne1M2();
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("enter rotation factor: ");
        int rotationFactor = kb.nextInt();

        for (int i = 0; i < rotationFactor; i++)
            object.rotateArrayOneByOne(array);

        CommonMethodsForArray.printArray(array);

    }
}
