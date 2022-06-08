class Solution {
    //Using hashset
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        while(!set.contains(n)) {
            set.add(n);
            
            int sumOfSquares = 0;
            
            while(n > 0) {
                int digit = n % 10;
                sumOfSquares += digit * digit;
                n = n/10;
            }
            if(sumOfSquares == 1)
                return true;
            else
                n = sumOfSquares;
        }
        return false;
    }
}

// Efficient solution using Floyd Cycle Detection algorithm
class SolutionEfficient {
    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n > 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
    
    boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if(fast == 1) return true;
        } while(slow != fast);
         return false;
    }
}