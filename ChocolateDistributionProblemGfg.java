class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(m > n)
            return -1;
        else if(m == 1 || m == 0)
            return 0;
        
        int[] arr = new int[a.size()];
        int k = 0;
        
        for(int num : a) {
            arr[k++] = num;
        }
        
        Arrays.sort(arr);
        
        int i=0;
        int j=m-1;
        
        int minDiff = Integer.MAX_VALUE;
        
        while(j < n) {
            if(arr[j] - arr[i] < minDiff)
                minDiff = arr[j] - arr[i];
            i++;
            j++;
        }
        
        long ans = minDiff;
        return ans;
    }
}