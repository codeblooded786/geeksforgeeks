import java.util.*;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 20/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class RemoveDuplicatesFromArrayOfSmallPrimes {


    /**
     * Method 1:
     * Naive approach : Time Complexity : O(n2) | Space Complexity : O(n)
     *
     * @param arr
     * @return
     */
    public static int[] removeDuplicates1(int arr[]) {
        int k = 1;
        int j;
        for (int i = 1; i < arr.length; i++) {
            for (j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    break;
                }
            }
            if (j == i)
                arr[k++] = arr[i];
        }

        int brr[] = new int[k];
        for (int i = 0; i < k; i++)
            brr[i] = arr[i];

        return brr;
    }

    /**
     * Method 2:
     * Using sorting : Time Complexity : O(nlogn) | Space Complexity : O(1)
     *
     * @param arr
     * @return
     */

    public static int[] removeDuplicates2(int arr[]) {
        Arrays.sort(arr);
        int k = 1;

        for (int i = 1; i < arr.length; ) {

            if (arr[i] == arr[i - 1])
                i++;
            else
                arr[k++] = arr[i++];
        }

        for (int i = k; i < arr.length; i++)
            arr[i] = Integer.MAX_VALUE;

        return arr;
    }

    /**
     * Method 2:
     * Using sorting : Time Complexity : O(n) | Space Complexity : O(n)
     *
     * @param arr
     */

    public static void removeDuplicates3(int arr[]) {
//        Integer []integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        List<Integer> list = new ArrayList<>(Arrays.asList(integers));

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));

        for (Integer x : integerSet)
            System.out.print(x + " ");

    }


    public static void main(String args[]) {
        int arr[] = {3, 5, 7, 2, 2, 5, 7, 7};

        removeDuplicates3(arr);

        /*for (int x : brr)
            if (x != Integer.MAX_VALUE)
                System.out.print(x + " ");*/
    }
}
