package main.lesson_02.lesson;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;
        Scanner sc = new Scanner(System.in);
        int arrivalTime;

        System.out.println("Please input arrival time: ");
        arrivalTime = sc.nextInt();

        // Comparison operators" ==, !=, > , <, >=, <=
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");
        if(isHeOnTime){
            System.out.println("\t --> Let's talk");
        }else {
            System.out.println("\t --> Write a letter");
        }
        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");
    }



}
