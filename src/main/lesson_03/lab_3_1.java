package main.lesson_03;

public class lab_3_1 {
    public static void main(String[] args) {
        int[] intArr = {21, 92, 16, 12, 90};
        int evenCountNumber = 0;
        int oddCountNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenCountNumber = evenCountNumber + 1;
            } else {
                oddCountNumber = oddCountNumber + 1;
            }
        }
        System.out.println("Your even numbers: " + evenCountNumber);
        System.out.println("Your odd number: " + oddCountNumber);
    }
}
