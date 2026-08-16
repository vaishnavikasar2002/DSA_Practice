// Day 6 - DSA Sheet (Q1) - Leetcode Num - 125

class LC_palindrome {
    public static boolean isPalindrome(String s) {
        // remove special chars + make lowercase
        // ^ hya symbol sathi shift + 6 use karne not symbol ahe
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < s.length()/2; i++){
            int n = s.length();
            if(s.charAt(i) != s.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
}


// 2nd way
// class Solution {
//     public boolean isPalindrome(String s) {
//         int i = 0, j = s.length() - 1;

//         while (i < j) {
//             while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
//             while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

//             if (Character.toLowerCase(s.charAt(i)) !=
//                 Character.toLowerCase(s.charAt(j))) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

