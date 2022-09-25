package main.lesson_05.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.print("Input your option : ");
        option = sc.nextInt();

        switch (option){
            case 1:
                addNumberIntoArrayList();
                break;
            case 2:
                printNumbers();
                break;
            case 3:
                getMaxNumber();
                break;
            case 4:
                getMinNumber();
                break;
            default:
                System.out.println("Your input is invalid. Please try again !!!");
        }

    }

    private static void getMinNumber() {
    }

    private static void getMaxNumber() {
    }

    private static void printNumbers() {
    }

    private static void addNumberIntoArrayList() {
        List<Integer> integerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int userInput;
        String userConfirmation;
        boolean isContinue= false;



        do {
            System.out.println("Input your number : ");
            integerList.add(userInput = sc.nextInt());

            System.out.println("Continue ? [Y/N] : ");
            userConfirmation = sc.nextLine();

            switch (userConfirmation){
                    case "Y" :
                        isContinue = false;
                        break;
                    case "N" :
                        isContinue = true;
                        break;
                    default:
                        System.out.println("Your input is invalid. Please try again !!");
                        break;
                }
        }while (true);

    }
}
