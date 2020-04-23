package gfg.ds.array;

import java.util.Scanner;

public class RotateArrayJuggling {

    void leftRotate(int arr[], int arraySize, int rotateBy) {

        int i, j, k, temp;
        int gcd = gcd(rotateBy, arraySize);
        for (i = 0; i < gcd; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + rotateBy;
                if (k >= arraySize)
                    k = k - arraySize;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }


        for ( i = 0; i < arraySize; i++)
            System.out.println(arr[i]);
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter by how much you want to rotate the array");
        //int rotateBy = kb.nextInt();
        RotateArrayJuggling rotateArrayJuggling = new RotateArrayJuggling();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotateArrayJuggling.leftRotate(arr, arr.length, 2);
    }

}
