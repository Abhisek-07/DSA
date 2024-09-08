import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    /// Sort the array, Fix i and j for every loop (slowly increase i and nested j loop), then check for 2 sum using 2 pointers as array is sorted. 
    // TC: 2 nested loops for fixed and i and j values and one inner nested loop for every fixed i and j value. O(N^3), Hashset is used so O(N) extra space.
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums == null || nums.length < 4) {
            return new ArrayList<>();
        }
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i < n-3; i++) {
            for(int j=i+1; j < n-2; j++) {
                long newTarget = (long) target - (long) nums[i] - (long) nums[j];
                int low = j+1, high = n-1;
                while(low < high) {
                    long sum = (long) nums[low] + (long) nums[high];
                    if(sum == newTarget) {
set.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));                        low++; high--; // duplicate quadraples are not allowed, so its ok to move both pointers
                    }
                    else if(sum > newTarget) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
    }
}