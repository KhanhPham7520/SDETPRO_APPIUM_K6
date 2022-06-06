package main.lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(3);

        /*
        * lay 3 gia tri nho nhat cua cai list nay
        *
        *
        *
        * */
        List<Integer> withoutDuplicatedValuesList = new ArrayList<>();
        for (Integer number : myArrayList){
            if(!withoutDuplicatedValuesList.contains(number)){
                withoutDuplicatedValuesList.add(number);
            }
        }
        System.out.println(myArrayList);
        Collections.sort(withoutDuplicatedValuesList);
        System.out.println(withoutDuplicatedValuesList);

        // Set
//        Set<Integer> set = new HashSet<>(myArrayList);
//        myArrayList = new ArrayList<>(set);
//        System.out.println(myArrayList);


        //sublist
        List<Integer>  first3minValues = withoutDuplicatedValuesList.subList(0,3);
    }
}
