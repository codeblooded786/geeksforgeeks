/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 18/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class NaivePatternSearching {
    public static Boolean search(String txt, String pat) {
        Boolean flag = Boolean.FALSE;
        int txtLength = txt.length();
        int patLength = pat.length();
        int k;
        for (int i = 0; i <= txtLength - patLength; i++) {
            k = 0;
            for (int j = i; j < i + patLength; j++) {
                if (txt.charAt(j) != pat.charAt(k++))
                    break;
            }
            if (k == patLength) {
                flag = Boolean.TRUE;
                System.out.println("Pattern is found at index: " + i);
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        Boolean flag = search(txt, pat);

        if (flag = Boolean.FALSE)
            System.out.println("Pattern not found");
    }
}
