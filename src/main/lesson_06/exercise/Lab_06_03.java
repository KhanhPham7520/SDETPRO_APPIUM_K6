package main.lesson_06.exercise;

public class Lab_06_03 {
    public static void main(String[] args) {
        String myStr = "100 minutes";

        char[] charArr = myStr.toCharArray();
        for (char characterItem : charArr) {
            if(Character.isDigit(characterItem)){
                System.out.print(characterItem);
            }
        }
    }
}
