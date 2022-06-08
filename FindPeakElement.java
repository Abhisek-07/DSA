class Solution {
    public int findPeakElement(int[] nums) {
        // This binary search approach works because boundary values in question are given as -infinity
        int l = 0;
        int r = nums.length - 1;
        int m = 0;
        
        while(l < r) 
        {
            m = l + (r-l)/2;
            
            if(nums[m] < nums[m+1])
                l = m+1;
            else
                r = m;
        }
        return r;   //return l also OK 
    }
}

// Another solution ... Easier to understand... same logic

	if(nums.length == 1) return 0; // single element
        
        int n = nums.length;
        
		// check if 0th/n-1th index is the peak element
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
		
		// search in the remaining array
        int start = 1;
        int end = n-2;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid-1]) end = mid - 1;
            else if(nums[mid] < nums[mid+1]) start = mid + 1;
        }
        return -1; // dummy return statement