package main.lesson_02;

import java.util.Scanner;

public class lab_02_01_exercise {
    public static void main(String[] args) {
        float height;
        float weight;
        float bmiResult;

        String underweight = "Underweight";
        String normalWeight = "Normal weight";
        String overweight = "Overweight";
        String obesity = "Obesity";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your height : ");
        height = scanner.nextFloat();

        System.out.print("Input your weight : ");
        weight = scanner.nextFloat();

        bmiResult = weight / (height * 2) *100;
        if(bmiResult >= 0 && bmiResult < 18.5){
            System.out.print("Your BMI are:"+bmiResult+" => You are "+underweight);
        } else if (bmiResult >= 18.5 && bmiResult <= 24.9) {
            System.out.print("Your BMI are:"+bmiResult+" => You are "+normalWeight);
        }else if (bmiResult >= 25 && bmiResult <= 29.9) {
            System.out.print("Your BMI are:"+bmiResult+" => You are "+overweight);
        }else if (bmiResult >= 30) {
            System.out.print("Your BMI are:"+bmiResult+" => You are "+obesity);
        }

    }
}
