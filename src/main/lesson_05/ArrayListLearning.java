package main.lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(1);
        myList.add(5);
        // 1, 2 ,4
        int insertedIndex = 2;
        int insertedValue = 3;

        myList.add(insertedIndex, insertedValue);
        System.out.println(myList);

        myList.set(3,4); // update value
        System.out.println(myList);

        myList.remove(3);
    }
}
