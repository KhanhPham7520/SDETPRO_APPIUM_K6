package main.lesson_03;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] foo = {3, 3, 7};
        int[] bar = {6, 8, 7};
        int[] merged = merge(foo, bar);
        System.out.println(Arrays.toString(merged));
    }

    // Big O Notation | Time Complexity | Space complexity
    private static int[] merge(int[] foo, int[] bar) {
        int fooLength = foo.length;
        int barLength = bar.length;
        int[] merged = new int[foo.length + bar.length];
        // 3,3,7,4,8,11
        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;
        while (fooPosition < fooLength && barPosition < barLength) {
            if (foo[fooPosition] < bar[barPosition]) {
                merged[mergedPosition++] = foo[fooPosition++];
            } else {
                merged[mergedPosition++] = bar[barPosition++];
            }
        }

        while (fooPosition < fooLength){
            merged[mergedPosition] = foo[fooPosition++];
        }

        while (barPosition < barLength){
            merged[mergedPosition] = bar[barPosition++];
        }
        return merged;
    }
}
