package Easy;

class LastWord {

    static int LastWordSolutionOne(String s) {
        // Split the string into word(s)
        String[] arr = s.split(" ");
        return arr[arr.length - 1].split("").length;
    }

    static int LastWordSolutionTwo(String s) {
        // Create a variable counter
        int counter = 0;
        boolean flag = false;

        // Iterate the string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (flag) {
                    break;
                }
            } else {
                flag = true;
                counter++;
            }

        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(LastWordSolutionTwo("Hello World"));
        System.out.println(LastWordSolutionTwo("   fly me   to   the moon  "));
        System.out.println(LastWordSolutionTwo("luffy is still joyboy"));
    }
}
