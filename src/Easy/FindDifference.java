package Easy;

import java.util.ArrayList;

class FindDifference {
    static char FindDifferenceSolution(String s, String t) {
        ArrayList<Character> myList2 = new ArrayList<Character>();

        for (int i = 0; i < t.length(); i++) {
            myList2.add(t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < myList2.size(); j++) {
                if (myList2.get(j) == s.charAt(i)) {
                    myList2.remove(j);
                    break;
                }
            }
        }

        return myList2.get(0);
    }

    public static void main(String[] args) {
        System.out.println(FindDifferenceSolution("abcd", "abcde"));
        System.out.println(FindDifferenceSolution("a", "aa"));
        System.out.println(FindDifferenceSolution("aba", "abaa"));
        System.out.println(FindDifferenceSolution("", "y"));
    }
}
