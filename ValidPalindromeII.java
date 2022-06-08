class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() <= 2)
            return true;
        
        int n = s.length();
        int i=0, j=n-1;
        
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) 
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            i++;
            j--;
        }
        return true;
    }
    
    /* Check is s[i...j] is palindrome. */
    public boolean isPalindrome(String str, int i, int j) {
        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}