class Solution {
    public int search(int[] nums, int target) {
        // if(nums.length == 0)
        //     return -1;
        
        int low=0, high=nums.length - 1;
        
        int mid = -1;
        
        while(low <= high) {
            mid = low + (high - low) / 2 ;
            
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] > target) 
                high = mid - 1;
            
            else if(nums[mid] < target) 
                low = mid + 1;
        }
        return -1;
    }
}