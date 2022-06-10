class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], nums[i]);
            else
                map.put(nums[i], map.get(nums[i]) + nums[i]);
        }
        
        int distinctNums[] = new int[map.size()];
        
        int j=0;
        
        for(Integer key : map.keySet()) {
            distinctNums[j] = key;
            j++;
        }
        
        Arrays.sort(distinctNums);
        
        // earn1 stores maxTillOneBeforePreviousIndex
        // earn2 stores maxTillPreviousIndex
        // Similar to House Robber problem DP
        
        int earn1 = 0;
        int earn2 = map.get(distinctNums[0]);
        
        for(int i=1; i < distinctNums.length; i++) {
            if(distinctNums[i] - distinctNums[i-1] == 1) 
            {
                int temp = earn2;
                earn2 = Math.max(map.get(distinctNums[i]) + earn1, earn2); 
                earn1 = temp;
            }
            else 
            {
                int temp = earn2;
                earn2 = map.get(distinctNums[i]) + earn2 ;
                earn1 = temp;
            }
        }
        return earn2;
    }
}

// A more efficient solution but couldn't understand

class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for (int num : nums)
            values[num] += num;

        int take = 0, skip = 0;
        for (int i = 0; i < n; i++) {
            int takei = skip + values[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
}