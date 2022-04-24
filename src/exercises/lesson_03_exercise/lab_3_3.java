package exercises.lesson_03_exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class lab_3_3 {

    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        Map<Integer, Boolean> arrMap = new TreeMap<>();

        for(int i = 0; i < intArr.length; i++)
        {
            arrMap.put(intArr[i],true);
        }

        System.out.println("Sorted Array From Min to Max :");
        for (Map.Entry<Integer,Boolean> integer : arrMap.entrySet())
        {
            System.out.print(integer.getKey() + " ");
        }
    }
}
