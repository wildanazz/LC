package Easy;

class TwoSum {
    static int[] TwoSumSolution(int[] nums, int target) {
        // Create an array of integer for result
        int[] result = new int[0];

        // Check whether the given array is empty or not
        if (nums.length == 0) {
            return result;
        }

        // Check the length of the given array
        if (nums.length == 1) {
            return nums;
        } else {
            result = new int[2];

            // Create two pointers and iterate through the given array
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        if ((nums[i] + nums[j]) == target) {
                            result[0] = i;
                            result[1] = j;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 3, 4, 5 };
        for (int i : TwoSumSolution(test1, 8)) {
            System.out.println(i);
        }

        int[] test2 = {};
        for (int i : TwoSumSolution(test2, 0)) {
            System.out.println(i);
        }

        int[] test3 = { 1 };
        for (int i : TwoSumSolution(test3, 1)) {
            System.out.println(i);
        }
    }
}
