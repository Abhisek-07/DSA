class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i < nums.length; i++){
            
            if(set.contains(nums[i]))
                return true;
            
            set.add(nums[i]);
        }
        return false;
    }
}

// Using HashSet O(n) TC & O(n) SC.
// Can be done using sorting with O(nlogn) TC & O(1) SC
// Native approach would take O(n^2) TC & O(1) SC