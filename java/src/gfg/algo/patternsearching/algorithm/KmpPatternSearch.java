package gfg.algo.patternsearching.algorithm;

public class KmpPatternSearch {

    public static void KMPSearch(String txt, String pat) {

        int i = 0;
        int j = 0;

        //  System.out.println("Inside KMPSearch");
        int lps[] = computeLPSArray(pat);
        for (int x :
                lps) {
            System.out.print(x + " ");
        }

        while (i < txt.length()) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                System.out.println("Pattern found at index: " + (i - j));
                j = lps[j - 1];
            } else if (i < txt.length() && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else {
                    j = 0;
                    i++;
                }
            }
        }
    }

    public static int[] computeLPSArray(String pat) {
        int lps[] = new int[pat.length()];

        lps[0] = 0;
        int i = 1;
        int j = 0;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(j)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else {
                    lps[i] = j;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String args[]) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        //String pat = "AABAABAAA";
        KMPSearch(txt, pat);
    }
}
