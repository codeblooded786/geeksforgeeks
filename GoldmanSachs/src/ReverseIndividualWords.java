/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 08/06/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class ReverseIndividualWords {


    public static String reverseIndividualWords(String str)
    {
        String arr[];

        for (int i=0;i<str.length();)
        {
            String s = "";
            while (str.charAt(i)!=' ')
            {
                s+=str.charAt(i);
                i++;
            }



        }

        return "x";
    }


    public static void main (String args[])
    {

        String str = "Hello World";
        reverseIndividualWords(str);

    }


}
