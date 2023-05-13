package Easy;

import java.util.HashMap;

class SingleNumber {
    static int SingleNunberSolution(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.get(nums[i]) == null) {
                myMap.put(nums[i], 1);
            } else {
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            }
        }

        int result = 0;
        for (int i : myMap.keySet()) {
            if (myMap.get(i) == 1)
                result = i;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 1, 2, 2, 4 };
        int[] test2 = { 1 };
        System.out.println(SingleNunberSolution(test1));
        System.out.println(SingleNunberSolution(test2));
    }

}
