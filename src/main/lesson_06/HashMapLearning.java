package main.lesson_06;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");

        for (Integer key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.remove(key);
            }
        }

        emergencyList.replace(113, "CSCD", "CSGT");

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
