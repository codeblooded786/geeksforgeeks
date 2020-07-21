import java.util.Arrays;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 21/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MaximumProductSubarray {

    public static int[] findMaximumProductSubarray(int arr[]) {
        int n = arr.length;
        int product, maxPdt;
        int k, j;
        maxPdt = Integer.MIN_VALUE;
        int superMax = Integer.MIN_VALUE;
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            product = arr[i];

            k = i;
            if (product > superMax) {
                x = i;
                y = k;
                superMax = product;
            }
            for (j = i + 1; j < n; j++) {
                if (arr[j] * product > product) {
                    k = j;
                    maxPdt = arr[j] * product;
                }
                product *= arr[j];
            }

            if (maxPdt > superMax) {
                superMax = maxPdt;
                x = i;
                y = k;
            }
        }

//        for (Map.Entry<Integer,Integer> entry :integerMap.entrySet())
//            System.out.println(entry.getKey()+" "+entry.getValue());
        return Arrays.copyOfRange(arr, x, y + 1);
    }

    public static void main(String args[]) {
        int arr[] = {6, -3, -10, 0, 2};
        // int arr[] = /*{-1, -3, -10, 0, 60} */{-2, -3, 0, -2, -40};
        int brr[] = findMaximumProductSubarray(arr);
        for (int x : brr)
            System.out.print(x + " ");
    }
}



