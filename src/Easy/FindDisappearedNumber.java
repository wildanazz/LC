package Easy;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class FindDisappearedNumber {
    static List<Integer> FindDisappearedNumberSolution(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        List<Integer> myList = new ArrayList<>();

        for (Integer integer : nums) {
            mySet.add(integer);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!mySet.contains(i)) {
                myList.add(i);
            }
        }

        return myList;
    }

    public static void main(String[] args) {
        int[] test1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] test2 = { 1, 1 };
        System.out.println(FindDisappearedNumberSolution(test1));
        System.out.println(FindDisappearedNumberSolution(test2));
    }

}
