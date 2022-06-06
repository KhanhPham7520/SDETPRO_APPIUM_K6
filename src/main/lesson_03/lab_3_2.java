package main.lesson_03;

public class lab_3_2 {
    public static void main(String[] args) {
        int[] integerArr = {28, 99, 34, 48, 500};
        int maxNumber = integerArr[0];
        int minNumber = integerArr[0];

        for (int i = 1; i < integerArr.length; i++) {
            if (integerArr[i] > maxNumber) {
                maxNumber = integerArr[i];
            } else if (integerArr[i] < minNumber) {
                minNumber = integerArr[i];
            }
        }
        System.out.println("Your minimum number : " + minNumber);
        System.out.println("Your maximum number : " + maxNumber);
    }
}
