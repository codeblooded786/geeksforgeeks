/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 22/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class TreeTraversal {

    public static void main(String args[]) {
        int i = 0;

        int arr[] = new int[10];

        arr[i] = i++;
        arr[i] = i++;

        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");

    }
}
