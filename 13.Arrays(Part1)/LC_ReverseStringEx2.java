//self LQ-344
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
public class LC_ReverseStringEx2 {

    public static void reverseString(char[] s) {

        int start = 0, end = s.length - 1;

        while (start < end) {

            //swap
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        char s[] = {'H', 'a', 'n', 'n', 'a', 'h'};

        reverseString(s);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

    }
}
