package search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        /* Since array is sorted we would be using binary search and lower bound technique
         lower bound of a number is number greater than or equals to given number e.g-
         lower_bound = num >= nums[index]
         */

        int len = nums.length;
        int leftPtr = 0 , rightPtr = len-1;
        // Binary Search
        while(leftPtr <= rightPtr){

            int midPtr = leftPtr + (rightPtr-leftPtr)/2;

            if(nums[midPtr] >= target){
                rightPtr = midPtr-1;
            }
            else{
                leftPtr = midPtr+1;
            }
        }

        return leftPtr;
    }
}
