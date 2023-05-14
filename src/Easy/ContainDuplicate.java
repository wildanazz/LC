package Easy;

import java.util.HashMap;
import java.util.HashSet;

class ContainDuplicate {
    static boolean ContainDuplicateSolution(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (myMap.get(i) == null) {
                myMap.put(i, 1);
            } else
                myMap.put(i, myMap.get(i) + 1);
        }

        for (int i : myMap.keySet()) {
            if (myMap.get(i) > 1) {
                return true;
            }
        }

        return false;
    }

    static boolean ContainDuplicateSolution2(int[] nums) {
        HashSet<Integer> mySet = new HashSet<Integer>();
        for (Integer integer : nums) {
            if (mySet.contains(integer)) {
                return true;
            } else
                mySet.add(integer);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 3, 1 };
        int[] test2 = { 1, 2, 3, 4 };
        int[] test3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(ContainDuplicateSolution(test1));
        System.out.println(ContainDuplicateSolution(test2));
        System.out.println(ContainDuplicateSolution(test3));
    }

}
