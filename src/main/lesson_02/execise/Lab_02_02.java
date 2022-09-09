package main.lesson_02.execise;

import java.util.Scanner;

public class Lab_02_02 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your number: ");
        inputNumber = sc.nextInt();

        if(inputNumber %2 == 0){
            System.out.println("Your number is even number");
        }else {
            System.out.println("Your number is odd number");
        }
    }
}
