package Easy;

import java.util.List;
import java.util.LinkedList;

class FizzBuzz {
    static List<String> FizzBuzzSolution(int n) {
        LinkedList<String> myList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                myList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                myList.add("Fizz");
            } else if (i % 5 == 0) {
                myList.add("Buzz");
            } else {
                myList.add(Integer.toString(i));
            }
        }
        return myList;
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzzSolution(3));
        System.out.println(FizzBuzzSolution(5));
        System.out.println(FizzBuzzSolution(15));
    }

}
