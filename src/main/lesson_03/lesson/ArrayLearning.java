package main.lesson_03.lesson;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] myIntArray = new int[ARRAY_LENGTH];

        // The first index begin from zero
        // The last index ends at index - 1
        for (int i = 0; i < 5; i++){
            myIntArray[i] = i;
        }

        /*
        * arr[0] = 1
        * arr[1] = 2
        * arr[2] = 3
        * arr[3] = 4
        *
        *
        * */

        // print out values
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.println(myIntArray[i]);
        }

        for(int value : myIntArray){
        }
    }
}
