package java.arrayandstrings;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 *
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 *
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int p1 = 0;
        int p2 = 0;

        while(p1 < s.length() && p2 < t.length())
        {
            char tChar = t.charAt(p2);
            char sChar = s.charAt(p1);
            if(tChar == sChar)
            {
                p1++;
            }
            p2++;
        }

        return p1 == s.length();
    }
}
