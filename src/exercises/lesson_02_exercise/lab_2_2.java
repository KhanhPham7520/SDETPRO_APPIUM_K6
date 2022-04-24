package exercises.lesson_02_exercise;

import java.util.Scanner;

public class lab_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Input your number : ");
        number = sc.nextInt();

        if(number %2 == 0 ){
            System.out.print("Your number is even number");
        }else {
            System.out.print("Your number is odd number");
        }

    }
}
