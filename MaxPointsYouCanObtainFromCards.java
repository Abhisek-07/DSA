class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        if(k == 0 || k > cardPoints.length)
            return 0;
        
        int n = cardPoints.length;
        int sum = 0;
        
        for(int i=n-k; i < n; i++){
            sum += cardPoints[i];
        }
        
        int maxSum = sum;
        
        if(k == n)
            return maxSum;
        
        int i=0, j=n-k;
        while(j < n){
            sum -= cardPoints[j];
            sum += cardPoints[i];
            i++;
            j++;
            if(sum > maxSum)
                maxSum = sum;
        }
        
        return maxSum;
    }
}