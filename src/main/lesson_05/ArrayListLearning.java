package main.lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = Arrays.asList(1,2,3,4);
        List<Integer> myArrList2 = new ArrayList<>();
        myArrList2.add(1);
        myArrList2.add(2);
        myArrList2.add(3);
        myArrList2.add(4);

        myArrList2.remove(1); // remove index
        myArrList2.remove(new Integer(1)); // remove element

        System.out.println(myArrList2);//3 , 4

        if(!myArrList.isEmpty()){
            System.out.println("List's size : " +myArrList.size());
        }

        //check element is exist
        System.out.println(myArrList.contains(1));//find if number 1 is exist
        System.out.println(myArrList.contains(5));


    }
}
