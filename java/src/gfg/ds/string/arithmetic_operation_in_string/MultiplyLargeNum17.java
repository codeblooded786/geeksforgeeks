package gfg.ds.string.arithmetic_operation_in_string;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyLargeNum17 {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        BigInteger num1 = kb.nextBigInteger();
        BigInteger num2 = kb.nextBigInteger();

        System.out.println(num1.multiply(num2));
    }
}

