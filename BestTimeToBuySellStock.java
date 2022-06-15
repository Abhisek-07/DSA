class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        
        int i=0, j=1;
        int maxProfit = 0;
        while(j < prices.length) {
            int profit = prices[j] - prices[i];
            if(profit <= 0)
                i = j;
            else if(profit > maxProfit)
                maxProfit = profit;
            j++;
        }
        return maxProfit;
    }
}

// Can be solved using Kadane's algorithm as well

class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}


// My previous solution, same logic as first one : track minimum price and find highest profit / difference

class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            else if(prices[i] - min_price > max_profit){
                max_profit = prices[i] - min_price;
            }
            
        }
        return max_profit;
    }
}