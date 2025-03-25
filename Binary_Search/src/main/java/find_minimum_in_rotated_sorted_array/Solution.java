package find_minimum_in_rotated_sorted_array;

class Solution {
    public int findMin(int[] nums) {

        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int low = 0 , high = len-1;

        while(low <= high){

            int mid = low + (high-low)/2;

            // left sorted
            if(nums[low] <= nums[mid]){
                min = Math.min(min , nums[low]);
                low = mid+1;
            }
            else{
                min = Math.min(min , nums[mid]);
                high = mid-1;
            }
        }

        return min;
    }
}