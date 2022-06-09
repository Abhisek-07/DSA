class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int maxLength = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        
        for(int i=0; i < n; i++) {
            sum += arr[i];
            
            if(sum == 0) {
                maxLength = i+1; //No comparison required beacause when sum == 0, i is from start of array
                continue;
            }
            if(map.containsKey(sum)) {
                int temp = i - map.get(sum);
                // if(temp > maxLength)
                //     maxLength = temp;
                maxLength = Math.max(maxLength, temp);
            }
            else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}