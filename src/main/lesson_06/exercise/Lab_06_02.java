package main.lesson_06.exercise;

import java.util.Scanner;

public class Lab_06_02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        String userInput;
        int countInput = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input your password : ");
            userInput = sc.nextLine();

            if (userInput.equals(myPassword)) {
                countInput++;
                System.out.println("you input right");
            }else {
                System.out.println("===> Please try again. Your input is invalid");
            }
            System.out.println("Your correct input count : " + countInput);

            if(countInput == 3 && userInput.equals(myPassword)){
                break;
            }
        } while (true);
        System.out.println("======= Finish the program =====");
    }
}
