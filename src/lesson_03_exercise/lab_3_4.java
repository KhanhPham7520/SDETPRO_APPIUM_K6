package lesson_03_exercise;

import java.util.*;

public class lab_3_4 {

    public static void main(String[] args) {
        int [] arraySortedOne = {1, 12, 16, 28, 34};
        int [] arraySortedTwo = {1, 13, 16, 27, 99};
        Map<Integer, Boolean> arrMap = new TreeMap<>();
        int sortedNumber;

        int sizeSortedArrayOne = arraySortedOne.length;
        int sizeSortedArrayTwo = arraySortedTwo.length;

        for(int i = 0; i < sizeSortedArrayOne; i++)
        {
            arrMap.put(arraySortedOne[i],true);
        }

        for(int i = 0;i < sizeSortedArrayTwo;i++)
        {
            arrMap.put(arraySortedTwo[i],true);
        }

        System.out.println("Sorted Array From Min to Max after merging 2 arrays :");
        for (Map.Entry<Integer,Boolean> integer : arrMap.entrySet())
        {
           System.out.print(integer.getKey() + " ");
        }

    }
}
