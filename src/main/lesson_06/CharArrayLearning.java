package main.lesson_06;

public class CharArrayLearning {
    public static void main(String[] args) {
        String withNumberStr = "34567abcdef";
        char[] charArr = withNumberStr.toCharArray();
        for (char character : charArr){
            if(Character.isDigit(character)){
                System.out.println(character + " is a digit");
            }else if(Character.isLetter(character)){
                System.out.println(character + " is a letter");
            }
        }
    }
}
