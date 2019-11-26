package gfg.gfg.pratice;

public class ChefRecipe {

    public static void computeRecipe(String mystr, int days) {
        int arr[] = new int[days];
        int f = 0, c = 0, a = 0;
        int flag = 0;
        int indexF = Integer.MAX_VALUE, indexC = Integer.MAX_VALUE, indexA = Integer.MAX_VALUE;
        for (int i = 0; i < days; i++) {
            if (mystr.charAt(i) == 'F') {
                f++;
                indexF = i;
            } else if (mystr.charAt(i) == 'C') {
                c++;
                indexC = i;
            } else {
                a++;
                indexA = i;
            }


            flag = 0;
            if (f == 3 || (f == 2 && (c == 1 || a == 1))) {
                flag = 1;
                if (f == 3) {
                    f = 0;
                    indexF = Integer.MAX_VALUE;
                } else if (c == 1 && indexC < indexA) {
                    f = 0;
                    c = 0;
                    indexC = Integer.MAX_VALUE;
                } else {
                    f = 0;
                    a = 0;
                    indexA = Integer.MAX_VALUE;
                }

            } else if (c == 3 || (c == 2 && (f == 1 || a == 1))) {
                flag = 1;
                if (c == 3) {
                    c = 0;
                    indexC = Integer.MAX_VALUE;
                } else if (f == 1 && indexF < indexA) {
                    f = 0;
                    c = 0;
                    indexF = Integer.MAX_VALUE;
                } else {
                    a = 0;
                    c = 0;
                    indexA = Integer.MAX_VALUE;
                }
            } else if (a == 3 || (a == 2 && (c == 1 || f == 1))) {
                flag = 1;
                if (a == 3) {
                    a = 0;
                    indexA = Integer.MAX_VALUE;
                } else if (c == 1 && indexC < indexF) {
                    c = 0;
                    a = 0;
                    indexC = Integer.MAX_VALUE;
                } else {
                    f = 0;
                    a = 0;
                    indexF = Integer.MAX_VALUE;
                }
            }
            if (flag == 0)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        for (int i = 0; i < days; i++)
            System.out.println(arr[i]);
    }


    public static void main(String args[]) {
        int days = 8;
        String mystr = "FCAFFFCA";
        computeRecipe(mystr, days);

    }
}
