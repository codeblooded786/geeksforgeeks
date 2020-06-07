/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 07/06/20
 * Time Complexity: O(n2)    |   Auxiliary Space: O(1)
 */

/*
Find subarray with given sum | Set 1 (Nonnegative Numbers)
Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.*/

public class SubarrayWithGivenSum {

    public static void subArraySum(int arr[], int desiredSum) {
        int sum, flag = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == desiredSum) {
                    System.out.println("Sum is found at index " + i + "," + j);
                    flag = 1;
                    break;
                }
                if (sum > desiredSum)
                    break;
            }
        }
        if (flag == 0)
            System.out.println("Sum not found");
    }

    public static void subArraySum(int arr[], int n, int desiredSum) {
        int i, l = 0, sum = 0;

        for (i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > desiredSum && l<=i) {
                sum -= arr[l];
                l++;
            }
            if (sum == desiredSum) {
                System.out.println("Sum is found at index " + l + "," + i);
                break;
            }
        }
        if (i == n)
            System.out.println("Sum not found");
    }


    public static void main(String args[]) {
        int arr[] = /*{1, 4, 20, 3, 10, 5}*/ /* {1, 4, 0, 0, 3, 10, 5} */{1, 4};
        // int sum = 33;

        //subArraySum(arr, /*33*//*7*/ 0);

        subArraySum(arr, arr.length,/*33*/ /*7*/0);
    }
}
