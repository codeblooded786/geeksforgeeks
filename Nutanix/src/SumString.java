import java.util.Scanner;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 13/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class SumString {


    public static String stringSum(String s1, String s2)
    {
        String s3="";
        return s3;

    }


    public static boolean sumStringUtil(String string, int beg, int len1, int len2)
    {

        String s1 = string.substring(beg,beg+len1);
        String s2 = string.substring(beg+len1,beg+len1+len2);
        


        return false;
    }


    public static boolean isSumString(String string)
    {

        for (int i=1;i<string.length();i++)
        {
            for (int j=1;i+j<string.length();j++)
            {
                if (sumStringUtil(string, 0, i, j))
                    return true;
            }
        }

        return false;
    }

    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);

        String string = kb.next();

        System.out.println("Given string: "+string+"is sum-string"+SumString.isSumString(string));

    }






}
