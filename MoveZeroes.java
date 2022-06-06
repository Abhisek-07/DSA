class Solution {
    
    // My solution
    
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        
        while(j < nums.length && i < j) {
            if(nums[i] != 0)
                i++;
            else {
                if(nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            j++;
        } 
    }
    
    // Efficient method from leetcode discuss
    // Shift non-zero values as far forward as possible
    // Fill remaining space with zeros

    public void moveZeroesEfficient(int[] nums) {
        if (nums == null || nums.length == 0) return;        

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }        

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
    
}