// This is O(1) or O(n) -> (not sure) init and O(n) query solution.

class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int sumRange = 0;
        for(int i=left; i <= right; i++) {
            sumRange += nums[i];
        }
        return sumRange;
    }
}

// This is O(n) init and (1) query solution. Different from leetcode discuss as I have not changed input array

public class NumArray {
    
    int[] prefixSum;

    public NumArray(int[] nums) {
        
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++)
            prefixSum[i] += nums[i] + prefixSum[i - 1];

    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return prefixSum[j];

        return prefixSum[j] - prefixSum[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */