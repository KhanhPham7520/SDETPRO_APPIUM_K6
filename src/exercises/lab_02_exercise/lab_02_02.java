package exercises.lab_02_exercise;

import java.util.Scanner;

public class lab_02_02 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number : ");
        inputNumber = scanner.nextInt();

        if(inputNumber % 2 == 0){
            System.out.println("Your input number is even number");
        }else {
            System.out.println("Your input number is odd number");
        }
    }
}
