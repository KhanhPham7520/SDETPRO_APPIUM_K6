package main.lesson_07;

import java.util.Arrays;

public class Calculator {

    // overloading : same class, Compile time
    // overriding : inheritance, run time

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2;
    }

    public static int sum(int... nums){
        System.out.println(Arrays.toString(nums));
        return 0;
    }

    // Vararg | Rest parameters
    public static void main(String... args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1));
    }
}
