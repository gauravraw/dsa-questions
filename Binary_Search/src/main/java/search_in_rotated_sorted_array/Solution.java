package search_in_rotated_sorted_array;

public class Solution {

    public int search(int[] nums, int target) {
        int len = nums.length;
        int low = 0 , high = len-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            // left sorted :- nums[low] <= nums[mid]
            if(nums[low] <= nums[mid]){
                if(nums[mid] >= target && target >= nums[low]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}
