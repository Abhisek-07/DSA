class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
//         int i=0, j=letters.length - 1;
//         int mid;
//         while(i <= j) {
//             mid = i + (j-i)/2 ;
            
//             if(letters[mid] == target) {
//                 if(mid < letters.length - 1) {
//                     if(letters[mid + 1] > target)
//                         return letters[mid + 1];
//                     i = mid + 1;
//                 }
//                 else if(mid == letters.length - 1)
//                     return letters[0];
//             }
//             if(letters[mid] < target) {
//                 i = mid + 1;
//             }
//             else if(letters[mid] > target){
//                 if(mid == 0)
//                     return letters[mid];
//                 else if(mid > 0) {
//                     if(letters[mid - 1] <= target)
//                         return letters[mid];
//                 }
//                 j = mid - 1;
//             }
//         }
//         return letters[0];
        
// ... Commented code works too but too many if checks
        
        int i=0, j=letters.length - 1;
        
        if(target > letters[letters.length - 1])
            return letters[0];
        
        if(target < letters[0])
            return letters[0];
        
        int mid;
        
        while(i <= j) {
            
            mid = i + (j - i) / 2;
            
            if(letters[mid] == target) {
                if(mid == letters.length - 1)
                    return letters[0];
                else {
                    if(letters[mid + 1] > target)
                        return letters[mid + 1];
                    i = mid + 1;
                }
            }
            if(letters[mid] < target)
                i = mid + 1;
            
            else if(letters[mid] > target)
                j = mid - 1;
        }
        return letters[i];
    }
}

// LeetCode Discuss solution

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {        
        int n = letters.length;
        if(target >= letters[n - 1]) return letters[0];
        
        int left = 0;
        int right = n - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(letters[mid] <= target) left = mid + 1;
            else right = mid;
        }
        
        return letters[right]; 
    }
}