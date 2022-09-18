package main.lesson_03.lesson;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {

        boolean isContinuing = true;
        Scanner sc = new Scanner(System.in);

        // perform until isContinuing have value as false
        while (isContinuing){
            System.out.println("=== Game Menu");
            System.out.println("0. Exit");
            System.out.println("1. Generate random number");

            System.out.print("Please enter a number : ");
            int userOption = sc.nextInt();

            if(userOption == 0){
                isContinuing = false;
            }else if(userOption == 1){

            }else {
                System.out.println("Nhap lui roi teo oi");
            }
        }
    }
}
