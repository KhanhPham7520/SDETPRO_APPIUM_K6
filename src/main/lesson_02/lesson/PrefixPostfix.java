package main.lesson_02.lesson;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // ++a : prefix
        // b++ : postfix
        int c = ++a + b++;
        // a = 2, b = 3, c = 4

        /*
        * prefix > right operand > assign value into left operand > postfix
        * a = 2
        * c = 4
        * b = 3
        *
        * */

        //breakpoint(s)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
