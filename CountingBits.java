// O(nlogn) solution ... dividing numbers by 2 and checking

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for(int i=1; i <= n; i++) {
            int count = 0;                  // count of ones
            int j = i;
            
            while(j > 0) {
                if(j % 2 == 1)
                    count++;
                j = j / 2;
            }
            ans[i] = count;
        }
        return ans;
    }
}

// DP solution O(n) TC. Draw binary of 1 to 8/16 and see the pattern
// no of 1 increases by 1 / msb increases by 1(shifts to left) for every power of 2 and then (all) numbers before it repeat.

class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;
        
        for(int i=1; i < n + 1; i++) {
            if(offset * 2 == i)
                offset = i;
            
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}