import java.util.Scanner;

public class Solution {

    public static boolean DishX(String arr[], int numberOfDays) {
        int fat = 0;
        int carb = 0;
        int fiber = 0;
        boolean dishX = false;
        int fatLoop = 0;
        int carbLoop = 0;
        int fiberLoop = 0;


        for (int i = 0; i < numberOfDays; i++) {
            if (arr[i].contains("FAT"))
                fat++;
            else if (arr[i].contains("CARB"))
                carb++;
            else if (arr[i].contains("FIBER"))
                fiber++;

            if ((fat >= 2 && fiber >= 2)) {
                dishX = true;
                fatLoop = 2;
                fiberLoop = 2;
                break;
            }
            if ((fat >= 3 && fiber >= 1)) {
                dishX = true;
                fatLoop = 3;
                fiberLoop = 1;
                break;
            }
            if ((fat >= 4)) {
                dishX = true;
                fatLoop = 4;
                break;
            }
        }

        if (dishX == true) {
            if (fatLoop == 2 && fiberLoop == 2) {
                for (int i = 0; i < numberOfDays; i++) {
                    if (arr[i].contains("FAT") && fatLoop > 0) {
                        arr[i] = null;
                        fatLoop--;
                    }

                    if (arr[i].contains("FIBER") && fiberLoop > 0) {
                        arr[i] = null;
                        fiberLoop--;
                    }
                }

            }

            if (fatLoop == 3 && fiberLoop == 1) {
                for (int i = 0; i < numberOfDays; i++) {
                    if (arr[i].contains("FAT") && fatLoop > 0) {
                        arr[i] = null;
                        fatLoop--;
                    }

                    if (arr[i].contains("FIBER") && fiberLoop > 0) {
                        arr[i] = null;
                        fiberLoop--;
                    }
                }

            }

            if (fatLoop == 4) {
                for (int i = 0; i < numberOfDays; i++) {
                    if (arr[i].contains("FAT") && fatLoop > 0) {
                        arr[i] = null;
                        fatLoop--;
                    }
                }
            }
        }

        return true;

    }

    public static boolean DishY(String arr[], int numberOfDays) {
        int fat = 0;
        int carb = 0;
        int fiber = 0;
        boolean dishY = false;
        int fatLoop = 0;
        int carbLoop = 0;
        int fiberLoop = 0;


        for (int i = 0; i < numberOfDays; i++) {
            if (arr[i].contains("FAT"))
                fat++;
            else if (arr[i].contains("CARB"))
                carb++;
            else if (arr[i].contains("FIBER"))
                fiber++;

            if ((carb >= 1 && fiber >= 3)) {
                dishY = true;
                carbLoop = 1;
                fiberLoop = 3;
                break;
            }
            if ((carb >= 2 && fiber >= 2)) {
                dishY = true;
                carbLoop = 2;
                fiberLoop = 2;
                break;
            }
            if ((carb >= 3 && fiber >= 1)) {
                dishY = true;
                carbLoop = 3;
                fiberLoop = 1;
                break;
            }
        }

        if (dishY == true) {
            if (carbLoop == 1 && fiberLoop == 3) {
                for (int i = 0; i < numberOfDays; i++) {
                    if (arr[i].contains("CARB") && carbLoop > 0) {
                        arr[i] = null;
                        carbLoop--;
                    }

                    if (arr[i].contains("FIBER") && fiberLoop > 0) {
                        arr[i] = null;
                        fiberLoop--;
                    }
                }

            }

            if (carbLoop == 2 && fiberLoop == 2) {
                for (int i = 0; i < numberOfDays; i++) {
                    if (arr[i].contains("CARB") && carbLoop > 0) {
                        arr[i] = null;
                        carbLoop--;
                    }

                    if (arr[i].contains("FIBER") && fiberLoop > 0) {
                        arr[i] = null;
                        fiberLoop--;
                    }
                }

            }

            if (carbLoop == 3 && fiberLoop == 1) {
                for (int i = 0; i < numberOfDays; i++) {
                    if (arr[i].contains("CARB") && carbLoop > 0) {
                        arr[i] = null;
                        carbLoop--;
                    }
                    if (arr[i].contains("FIBER") && fiberLoop > 0) {
                        arr[i] = null;
                        fiberLoop--;
                    }
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numberOfDays = kb.nextInt();

        String arr[] = new String[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            arr[i] = kb.next();
        }

        for (int i = 0; i < numberOfDays; i++) {
            boolean x = Solution.DishX(arr, i);
            boolean y = Solution.DishY(arr, i);

            if (x == true)
                System.out.print("X");
            else if (y == true)
                System.out.print("Y");
            else
                System.out.print("-");
        }
    }
}
