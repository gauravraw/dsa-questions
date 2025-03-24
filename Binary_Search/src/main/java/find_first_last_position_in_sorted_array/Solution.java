package find_first_last_position_in_sorted_array;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = getFirstPositionIndex(nums , target);
        // if firstIdx == -1 that means element doest exist in array
        if(firstIndex == -1){
            return new int[]{-1,-1};
        }
        int lastIndex = getLastPositionIndex(nums , target);

        return new int[]{firstIndex, lastIndex};
    }

    public int getLastPositionIndex(int [] nums , int target){
        int len = nums.length;
        int index = -1;
        int leftPtr = 0 , rightPtr = len-1;

        while(leftPtr <= rightPtr){
            int midPtr = leftPtr + (rightPtr-leftPtr)/2;

            if(nums[midPtr] == target){
                index = midPtr;
                leftPtr = midPtr+1;
            }
            else if(nums[midPtr] > target){
                rightPtr = midPtr-1;
            }
            else{
                leftPtr = midPtr+1;
            }
        }

        return index;
    }

    public int getFirstPositionIndex(int [] nums , int target){

        int len = nums.length;
        int index = -1;
        int leftPtr = 0 , rightPtr = len-1;

        while(leftPtr <= rightPtr){
            int midPtr = leftPtr + (rightPtr-leftPtr)/2;

            if(nums[midPtr] == target){
                index = midPtr;
                rightPtr = midPtr-1;
            }
            else if(nums[midPtr] > target){
                rightPtr = midPtr-1;
            }
            else{
                leftPtr = midPtr+1;
            }
        }

        return index;
    }
}
