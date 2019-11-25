package gfg.algo.patternsearching;

public class KmpPatternSearch {

    public static void KMPSearch(String txt, String pat) {

        System.out.println("Inside KMPSearch");
        int arr[] = computeLPSArray(pat);
        for (int x :
                arr) {
            System.out.print(x + " ");
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
        //  String pat = "ABABCABAB";
        String pat = "AABAABAAA";
        KMPSearch(txt, pat);
    }
}
