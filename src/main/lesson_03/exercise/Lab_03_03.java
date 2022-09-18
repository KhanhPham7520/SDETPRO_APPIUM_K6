package main.lesson_03.exercise;

public class Lab_03_03 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        System.out.println("Array after sorted");
        for (int i = 0 ; i < intArr.length; i++){
            for (int j = i + 1; j < intArr.length; j++) {
                int temp = 0;
                if(intArr[i] > intArr[j]){
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
            System.out.println(intArr[i]);
        }
    }
}
