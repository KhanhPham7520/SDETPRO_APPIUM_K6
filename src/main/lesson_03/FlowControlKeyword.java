package main.lesson_03;

public class FlowControlKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if(i == 3) continue; // skip number 3
            System.out.println(i);
        }
    }
}
