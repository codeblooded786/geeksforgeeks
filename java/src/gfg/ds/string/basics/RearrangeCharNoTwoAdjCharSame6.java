package gfg.ds.string.basics;

import java.util.Scanner;

public class RearrangeCharNoTwoAdjCharSame6 {

    private static void rearrangeChar(String string2) {
        StringBuilder string = new StringBuilder(string2);
        int i, j;
        char temp;

        for (i = 1; i < string.length(); i++) {
            j = i;
            if (string.charAt(i - 1) == string.charAt(i)) {
                while (j < string.length() && string.charAt(i) == string.charAt(j)) {
                    j++;
                }
            }
            if (j == string.length()) {
                System.out.println("Not Possible");
                return;
            }
            temp = string.charAt(i);
            string.setCharAt(i, string.charAt(j));
            string.setCharAt(j, temp);
        }
        System.out.println(string);
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = kb.next();
        rearrangeChar(string);
    }
}
