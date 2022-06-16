class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        
        for(int i=0; i < n; i++){
            int val = Math.abs(nums[i]);
            
            if(nums[val - 1] > 0)
                nums[val - 1] *= -1;
            
        }
        for(int i=0; i < n; i++){
            if(nums[i] > 0)
                list.add(i+1);
        }
        return list;
    }
}

// Marked negative for existing number indexes as numbers are in the range [1,n] ... O(n) TC & O(1) SC
// Another option is to use hashset to check but it takes O(n) TC & O(n) SC