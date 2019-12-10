package gfg.ds.string.arithmetic_operation_in_string;

public class DifficultyOfSentence26 {

    private static int calculateDifficulty(String string) {
        int difficulty = 0, consonent, vowel, hard = 0, easy = 0, consecutive = 0;
        boolean flag , newflag=false;
        String str[] = string.split(" ");

        for (String str1 :
                str) {
            consonent = 0;
            vowel = 0;
            flag = false;
            consecutive = 0;
            newflag=false;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != 'a' && str1.charAt(i) != 'e' && str1.charAt(i) != 'i' && str1.charAt(i) != 'o' && str1.charAt(i) != 'u') {
                    consonent++;
                    flag = true;
                    if (flag == true) {
                        consecutive++;
                        if (consecutive == 4)
                        {
                            newflag=true;
                            break;
                        }
                    }
                } else {
                    vowel++;
                    flag=false;
                    consecutive=0;
                }
            }
            if (newflag==true || consonent > vowel)
                hard++;
            else
                easy++;
        }
        difficulty = (5 * hard) + (3 * easy);
        return difficulty;
    }

    public static void main(String args[]) {
        String string = "We are geeks";
        int difficulty = calculateDifficulty(string.toLowerCase());
        System.out.println(difficulty);
    }
}
