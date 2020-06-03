package gfg.algo.dynamicprogramming.basic;

import java.util.Scanner;

public class LongestCommonSubsequence32 {

    public static int LCS(String s1, String s2) {

        int lcs[][] = new int[s1.length()][s2.length()];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {

                if (i == j)
                    lcs[i][j] = 0;

                if (s1.charAt(i) == s1.charAt(j))
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;

                if (s1.charAt(i) != s2.charAt(j))
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j]);
            }
        }

        return lcs[s1.length() - 1][s2.length() - 1];
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        String s1 = kb.next();
        String s2 = kb.next();

        int l = LCS(s1, s2);

        System.out.println(l);

    }


}
