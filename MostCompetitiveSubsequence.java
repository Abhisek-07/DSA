class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i < n; i++) {
            while(!stack.isEmpty() && nums[i] < stack.peek() && stack.size() - 1 + nums.length - i >= k) {
                stack.pop();
            }
            
            if(stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        int[] ans = new int[k];
        for(int i = k-1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}

// Uses monotonic increasing stack