//self LQ-344
// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

public class LC_ReverseStringEx1 {

    // Made the method static so it can be called directly from the static main method
    public static void reverseString(char[] s) {
        int start = 0, end = s.length - 1;

        while (start < end) {
            // swap
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'};

        // Call the static method
        reverseString(s);

        // CORRECTION 2: Typo correction: 'inr' should be 'int'
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
