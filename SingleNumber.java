class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        
        for(int i=0; i < nums.length; i++) {
            ans = ans ^ nums[i]; 
        }
        return ans;
    }
}

// Using xor as question says every element appears twice except for one... a^a = 0 & a^0 = a