package gfg.algo.patternsearching;

import java.util.Scanner;

public class NaivePatternSearch {

    public void findPattern(String txt, String pat)
    {
        int i,j,k,flag=0;
        for(i=0;i<=txt.length()-pat.length();i++)
        {
            k=0;
            for (j=i;j<i+pat.length();j++)
            {
                if(txt.charAt(j)!=pat.charAt(k))
                    break;
                k++;
            }
            if(k==pat.length())
            {
                System.out.println("Pattern present at "+i);
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Pattern not found");
    }

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        /*String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";*/
        System.out.println("enter pattern to search");
        String txt = kb.nextLine();
        String pat = kb.nextLine();
        NaivePatternSearch naivePatternSearch = new NaivePatternSearch();
        naivePatternSearch.findPattern(txt, pat);
    }
}
