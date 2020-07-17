import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project geeksforgeeks
 * Created by @author Rahul Dev Gupta on 11/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class SumAsPerString {


    public static int evaluateString(String str) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "minus"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        List<Integer> integerList = new ArrayList<>();

        int i = 0;
        int lengthOfStr = str.length();
        int index;

        while (i != lengthOfStr) {
            if (i + 3 <= lengthOfStr && list.contains(str.substring(i, i + 3))) {
                index = list.indexOf(str.substring(i, i + 3));
                integerList.add(index);
                i = i + 3;
            } else if (i + 4 <= lengthOfStr && list.contains(str.substring(i, i + 4))) {
                index = list.indexOf(str.substring(i, i + 4));
                integerList.add(index);
                i = i + 4;
            } else if (i + 5 <= lengthOfStr && list.contains(str.substring(i, i + 5))) {
                index = list.indexOf(str.substring(i, i + 5));
                integerList.add(index);
                i = i + 5;
            } else {
                i++;
                integerList.add(20);
            }
        }


        //  integerList.stream().forEach(System.out::println);


        List<Integer> newList = processIntegerArray(integerList);
        //   newList.stream().forEach(System.out::println);


        List<Integer> integerList1 = processProcessedArray(newList);
        integerList1.stream().forEach(System.out::println);

        i = 1;

        int sum = integerList1.get(0);
        while (i < integerList1.size()) {
            if (integerList1.get(i) == 10) {
                i++;
                sum -= integerList1.get(i);
                i++;
            } else if (i < integerList1.size() && integerList1.get(i) == 20) {
                i++;
                sum += integerList1.get(i);
                i++;
            }
        }

        return sum;
    }

    public static List<Integer> processIntegerArray(List<Integer> integerList) {
        int i = 0;

        List<Integer> processedList = new ArrayList<>();
        int flag = 0;
        int minusflag = 0;

        while (i < integerList.size()) {
            while (integerList.get(i) == 10 || integerList.get(i) == 20) {
                flag = 1;
                if (integerList.get(i) == 10)
                    minusflag = 1;
                i++;
            }
            if (flag == 0) {
                processedList.add(integerList.get(i++));
            } else {
                if (minusflag == 1) {
                    processedList.add(10);
                    minusflag = 0;
                } else
                    processedList.add(20);
                processedList.add(integerList.get(i++));
                flag = 0;
            }
        }


        return processedList;
    }

    public static List<Integer> processProcessedArray(List<Integer> integerList) {
        int num = 0;
        int i = 0;

        List<Integer> processedList = new ArrayList<>();

        while (i < integerList.size()) {
            num = 0;
            while (i < integerList.size() && ((integerList.get(i) != 20) && integerList.get(i) != 10)) {
                num = num * 10 + integerList.get(i++);
            }

            processedList.add(num);

            if (i < integerList.size() && integerList.get(i) == 20)
                processedList.add(20);
            else if (i < integerList.size() && integerList.get(i) == 10)
                processedList.add(10);

            i++;

        }

        return processedList;


    }

    public static void main(String args[]) {
        String str = "onetwothreefour";

        int result = evaluateString(str);

        System.out.println(result);


    }
}
