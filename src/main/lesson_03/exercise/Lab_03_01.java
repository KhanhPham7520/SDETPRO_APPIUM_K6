package main.lesson_03.exercise;

public class Lab_03_01 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int countEvenNumber = 0;
        int countOddNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                countEvenNumber++;
            } else if(intArr[i] % 2 != 0){
                countOddNumber++;
            }
        }
        System.out.println("Even Numbers : " + countEvenNumber);
        System.out.print("Odd Numbers : " + countOddNumber);
    }
}
