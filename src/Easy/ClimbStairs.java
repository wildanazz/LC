package Easy;

class ClimbStairs {
    static int ClimbStairsSolution(int n) {
        // Check if n is 1 or not
        if (n == 1)
            return 1;

        // Check if n is 2 or not
        if (n == 2)
            return 2;

        // Create an array to save computation
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        // Fibonacci series
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(ClimbStairsSolution(2));
        System.out.println(ClimbStairsSolution(3));
        System.out.println(ClimbStairsSolution(4));
    }

}
