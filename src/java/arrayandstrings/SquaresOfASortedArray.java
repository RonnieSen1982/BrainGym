package java.arrayandstrings;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */

import java.util.*;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        List<Integer> negativeSQList = new ArrayList<Integer>();// This will sorted in descedending order
        List<Integer> positiveSQList = new ArrayList<Integer>();//This will be sorted in ascending order
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                negativeSQList.add(nums[i] * nums[i]);
            }
            else
            {
                positiveSQList.add(nums[i] * nums[i]);
            }
        }
        //Now we merge the positive and negative square lists
        int p1 = negativeSQList.size() - 1;// Since it is sorted in descending order we start from the end
        int p2 = 0;
        int index = 0;
        while(p1 >= 0 && p2 < positiveSQList.size())
        {
            int num1 = negativeSQList.get(p1);
            int num2 = positiveSQList.get(p2);
            if(num1 < num2)
            {
                result[index] = num1;
                p1--;
            }
            else
            {
                result[index] = num2;
                p2++;
            }
            index++;
        }
        //Check if negative list is exhasuted
        while(p1 >= 0)
        {
            result[index] = negativeSQList.get(p1);
            p1--;
            index++;
        }
        //Check if positive list is exhausted
        while(p2 < positiveSQList.size())
        {
            result[index] = positiveSQList.get(p2);
            p2++;
            index++;
        }
        return result;
    }
}
