package main.lesson_03.exercise;

public class Lab_03_02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int maxNum = intArr[1];
        int minNum = intArr[2];

        for (int i = 0 ; i < intArr.length; i++){
            if(intArr[i] > maxNum){
                maxNum = intArr[i];
            }else if(intArr[i] < maxNum){
                minNum = intArr[i];
            }
        }
        System.out.println("Min num is "+ minNum);
        System.out.println("Max num is "+ maxNum);
    }
}
