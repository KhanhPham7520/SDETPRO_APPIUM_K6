package main.lesson_03;

public class lab_3_3 {
    public static void main(String[] args) {
        int[] sortArray = {28, 99, 34, 48, 500};
        for (int i = 1; i < sortArray.length ; i++) {
            int keyValue = sortArray[i];
            int j = i-1;
            while (j>=0 && keyValue < sortArray[j]) {
                sortArray[j+1] = sortArray[j];
                j--;
            }
            sortArray[j + 1] = keyValue;
        }

        System.out.println("Sorted Array in Ascending Order: ");
        for (int i : sortArray) {
            System.out.println(i);
        }
    }
}
