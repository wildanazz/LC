package Easy;

class PalindromeNumber {
    static boolean PalindromeNumberSolution(int x) {
        // Create a variable sum to compare with x
        int sum = 0;
        int remainder = 0;

        // Check whether x is 0 or not
        if (x == 0)
            return true;
        else {
            int temp = x;
            while (temp > 0) {
                remainder = temp % 10;
                sum = sum * 10 + remainder;
                temp = temp / 10;
            }
        }

        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(PalindromeNumberSolution(121));
        System.out.println(PalindromeNumberSolution(-121));
        System.out.println(PalindromeNumberSolution(10));
    }

}
