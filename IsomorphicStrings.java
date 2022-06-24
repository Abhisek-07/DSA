class Solution {
    // hashmap solution
    
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        
        Map<Character, Integer> mapS = new HashMap<Character, Integer>();
        Map<Character, Integer> mapT = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            Integer indexS = mapS.getOrDefault(s.charAt(i), -1);
            Integer indexT = mapT.getOrDefault(t.charAt(i), -1);
                        
            if (!indexS.equals(indexT)) {
                return false;
            }
            
            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }
        
        return true;
    }
}

// Better Solution

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        
        for(int i=0; i < n; i++) {
            if(m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;             // i + 1 to avoid case where 0 would equal 2 unequal things
        }
        return true;
    }
}