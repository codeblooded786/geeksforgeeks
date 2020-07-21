/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 21/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MatrixRotationBy90WithoutExtraSpace {

    public static void rotate90(int arr[][]) {
        transposeOfMatrix(arr);
      //  reverseColumns(arr);
        reverseRows(arr);

    }

    public static void transposeOfMatrix(int arr[][]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //   printMatrix(arr);
    }

    /**
     * for anticlockwise rotation
     *
     * @param arr
     */
    public static void reverseColumns(int arr[][]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int k = arr.length - 1;
            for (int j = 0; j < arr[i].length / 2; j++) {
                temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
                k--;
            }
        }
    }

    /**
     * for clockwise rotation
     *
     * @param arr
     */
    public static void reverseRows(int arr[][]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i].length - 1;
            for (int j = 0; j < arr[i].length/2; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                k--;
            }
        }
    }

    /*public static void swap(int x, int y)
    {
        int temp=x;
        x=y;
        y=temp;
    }*/

    public static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

    }

    public static void main(String args[]) {
        {
            int arr[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};

            // printMatrix(arr);
            rotate90(arr);
            printMatrix(arr);
        }
    }
}
