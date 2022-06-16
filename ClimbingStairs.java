
// DP Memoization solution

class Solution {
    public int climbStairs(int n) {
        int ways[] = new int[n];
        int a = find(1, n, ways);
        int b = find(2, n, ways);
        return a+b;
    }
    int find(int x, int n, int[] ways) {
        if(x == n)
            return 1;
        if(x > n)
            return 0;
        
        if(ways[x] != 0)
            return ways[x];
        
        ways[x] = find(x + 1, n, ways) + find(x + 2, n, ways);
        
        return ways[x];
        
    }
}

// Original DP solution from NeetCode 
// two = no of steps from n, one = no of steps from one_before_n
// turns into fibonacci series solution

class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        
        for(int i = n-2; i >= 0; i--) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
}