package java.arrayandstrings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 *
 */

public class ReverseString {

    public void reverseString(char[] s) {


        int p1 = 0;
        int p2 = s.length - 1;

        while(p1 < p2)
        {
            if(s[p1] != s[p2])
            {
                //swap
                char temp = s[p1];
                s[p1] = s[p2];
                s[p2] = temp;

            }
            p1++;
            p2--;
        }
    }

}
