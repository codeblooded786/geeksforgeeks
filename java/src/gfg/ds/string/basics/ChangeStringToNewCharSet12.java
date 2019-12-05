package gfg.ds.string.basics;

import java.util.Scanner;

public class ChangeStringToNewCharSet12 {

    public static void main(String args[])
    {
        String string1 = new String("qwertyuiopasdfghjklzxcvbnm");

        String string2 = new String("abcdefghijklmnopqrstuvwxyz");

        String string4 = "";

        Scanner kb = new Scanner(System.in);

        char ch;

        System.out.println("enter string to decode: ");
        String string3 = kb.next();

        for (int i=0;i<string3.length();i++)
        {
            ch=string3.charAt(i);

            string4 = string4 + string2.charAt(string1.indexOf(ch));

        }

        System.out.println(string4);
    }
}
