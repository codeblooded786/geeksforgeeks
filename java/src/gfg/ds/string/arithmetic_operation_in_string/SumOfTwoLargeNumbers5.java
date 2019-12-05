package gfg.ds.string.arithmetic_operation_in_string;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfTwoLargeNumbers5 {

    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);

        BigInteger bigInteger1 = kb.nextBigInteger();
        BigInteger bigInteger2 = kb.nextBigInteger();

        System.out.println(bigInteger1.add(bigInteger2));


    }
}
