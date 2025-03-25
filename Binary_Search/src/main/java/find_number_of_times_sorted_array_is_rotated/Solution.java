package find_number_of_times_sorted_array_is_rotated;

public class Solution {

    public int findNumberOfRotation(int [] nums){

        int len = nums.length;
        int minIdx = -1 , min = Integer.MAX_VALUE;

        int low = 0 , high = len-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            // left sorted
            if(nums[low] <= nums[mid]){

                if(min > nums[low]){
                    min = nums[low];
                    minIdx = low;
                }
                low = mid+1;
            }
            else{
                if(min > nums[mid]){
                    min = nums[mid];
                    minIdx = mid;
                }
                high = mid-1;
            }
        }

        return minIdx;
    }
}
