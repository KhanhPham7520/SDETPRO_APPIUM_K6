package lesson_02_exercise;

import java.util.Scanner;

public class lab_2_1 {
    public static void main(String[] args) {
        float height;
        float weight;
        float BMI;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height : ");
        height = sc.nextInt();

        System.out.print("Enter your weight : ");
        weight = sc.nextInt();

        BMI = weight / (height *height) * 10000;

        if(BMI < 18.5){
            System.out.println("Your BMI are "+BMI+" => you are Underweight");
        }
        if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Your BMI are "+BMI+" => you are Normal weight ");
        }
        if(BMI >= 25 && BMI <= 29.9){
            System.out.println("Your BMI are "+BMI+" => you are Overweight");
        }
        if(BMI >= 30){
            System.out.println("Your BMI are "+BMI+" => you are Obesity");
        }
    }
}
