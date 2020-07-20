/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 20/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MinimumElementInSortedRotatedArrayWithoutDuplicates {

    public static int findMin(int arr[]) {
        if (arr.length == 1)
            return arr[0];

        int low = 0, high = arr.length - 1, mid;

        if (arr[high] > arr[low])
            return arr[0];

        while (high > low) {
            mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1])
                return arr[mid + 1];

            if (arr[mid - 1] > arr[mid])
                return arr[mid];

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr1[] = {5, 6, 1, 2, 3, 4};
        int min = findMin(arr1);
        System.out.println(min);
    }
}
