package Easy;

import java.util.LinkedList;

class PlusOne {
    static int[] PlusOneSolution(int[] digits) {
        // Create a linkedlist for storing integer
        LinkedList<Integer> myArr = new LinkedList<Integer>();

        boolean flag = true;
        int temp = 0;
        int remainder = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            temp = digits[i];

            // Add last digit in the array with one
            if (flag) {
                temp = digits[i] + 1;
                flag = false;
            }

            // Check whether remainder exists from the previous iteration or not
            if (remainder == 1) {
                temp = temp + 1;
                remainder = 0;
            }

            // Check whether the addition is equal to 10 or not
            if (temp == 10) {
                remainder = 1;
                myArr.addFirst(0);
            } else {
                myArr.addFirst(temp);
            }
        }

        // Check whether the last iteration leaves remainder or not
        if (remainder == 1) {
            myArr.addFirst(1);
        }

        int[] result = new int[myArr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = myArr.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 3 };
        int[] test2 = { 9 };
        int[] test3 = { 2, 9, 9 };
        int[] test4 = { 2, 8, 9 };
        System.out.println(PlusOneSolution(test1));
        System.out.println(PlusOneSolution(test2));
        System.out.println(PlusOneSolution(test3));
        System.out.println(PlusOneSolution(test4));
    }
}
