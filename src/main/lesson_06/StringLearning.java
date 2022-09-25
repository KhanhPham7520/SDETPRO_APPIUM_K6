package main.lesson_06;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {

        //immutable
        String badWordsContainer = "  bad, very bad, sth else, bad!!";
        String filteredStr = badWordsContainer.replace("bad", "b**");
        System.out.println(filteredStr.trim());

        // substring, indexOf, split
        String url = "https//google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));

        System.out.println(url.indexOf("o"));
        System.out.println(url.indexOf("https"));

        String[] splitStr = url.split("o");
        System.out.println(Arrays.toString(splitStr));

    }
}
