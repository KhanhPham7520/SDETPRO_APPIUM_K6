package main.lesson_02.lesson;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNumOne = 1;
        int myNumTwo = 3;

        int total = myNumOne + myNumTwo;
        System.out.println(total);

        System.out.printf("Total is %d\n", total);
        System.out.printf("Total is %f\n", 3.14f);
        System.out.printf("Boolean value is %b\n", true);
        System.out.printf("Character value is %s\n", "a");

        int nguyen = 5/3;
        int d = 5%3;

        System.out.printf("5/3 is %d\n", 5/3);
        System.out.printf("d is %d", d);

        float myFloatNum = 5/3f;
        System.out.println(myFloatNum);
    }
}
