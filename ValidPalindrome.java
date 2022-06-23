class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())  // if(s.length() == 0)
            return true;
        
        int i=0, j=s.length()-1; 
        
        while(i < j) {
            char head = s.charAt(i);
            char tail = s.charAt(j);
            
            if(!Character.isLetterOrDigit(head))
                i++;
            
            else if(!Character.isLetterOrDigit(tail))
                j--;
            
            else {
                if(Character.toLowerCase(head) != Character.toLowerCase(tail)) {
                    return false;
                }
                i++;
                j--;
            } 
        }
        return true;
    }
}