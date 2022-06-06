package main.lesson_05;

public class StringLearning {
    public static void main(String[] args) {
        String myName1 = "Teo";
        String myName2 = "Teo";
        String myName3 = new String("Teo");

        System.out.println(("My name 1 vs My Name 2 " + (myName1 == myName2)));
        System.out.println(("My name 1 vs My Name 3 "+ (myName1 == myName3)));

        //check lower case, uppercase, digit
        String myPassword = "123myPassword";
        char[] myCharacter = myPassword.toCharArray();

        int totalDigits = 0;
        int totalUppercases = 0;
        int totalLowercases = 0;
        for(char character : myCharacter){
            if(Character.isDigit(character))totalDigits++;
            else if (Character.isUpperCase(character)) totalUppercases++;
            else if (Character.isLowerCase(character)) totalLowercases++;
        }

        if(totalDigits > 0 && totalLowercases > 0 && totalUppercases > 0){
            System.out.println("You are all set");
        }else {
            System.out.println("Password is invalid");
        }

        //Replacement | Immutable
        String badWordContainer = "bad, very bad, sth else, bad";
        String filteredStr = badWordContainer.replace("bad", "b**");
        System.out.println(filteredStr);
    }
}
