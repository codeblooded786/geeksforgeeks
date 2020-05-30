package gfg.algo.dynamicprogramming.basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence34 {

    public static int LIS(int arr[])
    {
        int lis[]=new int[arr.length];

        Arrays.fill(lis,1);

        int i=1,j=0;

        while(i<arr.length)
        {
            if (arr[i]>arr[j])
            {
                lis[i]=Math.max(lis[i],lis[j]+1);
            }
            j++;
            if (i==j)
            {
                j=0;
                i++;
            }
        }

        for (int x:lis)
            System.out.println(x);

//        Integer brr[] = Arrays.stream(lis).boxed().toArray(Integer[]::new);
//
//        )

//        Arrays.sort(brr,Collections.reverseOrder());
        Arrays.sort(lis);
        return lis[lis.length-1];
    }

    public static void main(String args[])
    {
        int arr[]= {3,4,-1,0,6,2,3};
        LIS(arr);
    }
}
