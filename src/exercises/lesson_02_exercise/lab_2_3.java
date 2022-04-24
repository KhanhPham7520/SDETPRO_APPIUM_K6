package exercises.lesson_02_exercise;

import java.util.Scanner;

public class lab_2_3 {
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

        if(BMI < 18.5) {
            System.out.println("You should increase weight");
        }
        if(BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You do not need to increase or decrease weight");
        }
        if(BMI >= 25){
            System.out.println("You should decrease weight");
        }
    }
}
