package main.lesson_02.execise;

import java.util.Scanner;

public class Lab_02_01 {
    public static void main(String[] args) {
        double height;
        double weight;
        double BMI;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your weight : ");
        weight = sc.nextInt();

        System.out.println("Input your height : ");
        height = sc.nextInt();

        BMI = weight / (height * 2);

        if(BMI <= 18.5){
            System.out.println("Your BMI is Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your BMI is Normal weight");
        } else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Your BMI is Overweight");
        } else if (BMI >= 30) {
            System.out.println("Your BMI is Obesity");
        }
    }
}
