class Solution {
    public int missingNumber(int[] nums) {
        
        int total = 0;
//         for(int i=0; i <= nums.length; i++) {
            
//         }
        int sum = 0;
        int i;
        for( i=0; i < nums.length; i++) {
            total += i;
            sum += nums[i];
        }
        total += i;
        int ans = total - sum;
        return ans;
    }
}

// Another solution using xor

public int missingNumber(int[] nums) {

    int xor = 0, i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}

	return xor ^ i;
}