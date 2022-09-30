package main.lesson_07;

import main.utils.ArrayListHelper;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> myArrayList = Arrays.asList(1, 2, 3, 4);
        int minValue = ArrayListHelper.findMinValue(myArrayList);
        int maxValue = ArrayListHelper.findMaxValue(myArrayList);

        System.out.println(minValue);
        System.out.println(maxValue);

    }
}
