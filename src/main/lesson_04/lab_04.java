package main.lesson_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_04 {
    public static void main(String[] options){
        printMenu();
        int position = 0;
        boolean isSelectedOption = true;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> myArrayList = new ArrayList<>();
        do {
            System.out.print("\n Please input a number to select: ");
            switch (getOptionOfUser()) {
                case 1:
                    System.out.print("Input number into list : ");
                    myArrayList = addArrayList(arrayList, getOptionOfUser());
                    break;
                case 2:
                    System.out.println("Your number list are");
                    printInputedNumbers(myArrayList);
                    break;
                case 3:
                    System.out.println("Max number is " + getMaxNumber(myArrayList));
                    break;
                case 4:
                    System.out.println("Min number is : " + getMinNumber(myArrayList));
                    break;
                default:
                    System.out.println("Only input your option for No.1 -> No.4");
                    isSelectedOption = false;
            }
        } while (isSelectedOption);
    }

    public static int getOptionOfUser() {
        Scanner scanner = new Scanner(System.in);
        int getUserNumber = scanner.nextInt();
        return getUserNumber;
    }

    public static void printMenu() {
        System.out.print("1. Add number into ArrayList\n" +
                "2. Print numbers\n" +
                "3. Get maximum number\n" +
                "4. Get minimum number\n" +
                "5. Search a number\n");
    }

    public static List<Integer> addArrayList(List<Integer> numberList, int inputNumber) {
        numberList.add(inputNumber);
        return numberList;
    }

    public static void printInputedNumbers(List<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i)+" ");
        }
    }

    public static int getMaxNumber(List<Integer> numberList) {
        int maxNumber = 0;
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > maxNumber) {
                maxNumber = numberList.get(i);
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(List<Integer> numberList) {
        int minNum = numberList.get(0);
        for (int index = 0; index < numberList.size(); index++) {
            if (numberList.get(index) < minNum) {
                minNum = numberList.get(index);
            }
        }
        return minNum;
    }
}
