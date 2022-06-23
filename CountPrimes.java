// Based on sieve of Eratosthenes but STRICTLY LESS THAN N.

class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1)
            return 0;
        int[] primes = new int[n];
        
        for(int i=0; i < n; i++) {
            primes[i] = 1;
        }
        primes[0] = primes[1] = 0;
        
        for(int i=2; i <= Math.sqrt(n); i++) {
            if(primes[i] == 1) {
                for(int j=2; i*j < n; j++) {
                    primes[i*j] = 0;
                }
            }
        }
        int count = 0;
        
        for(int i=0; i < primes.length; i++) {
            if(primes[i] == 1)
                count++;
        }
        return count;
    }
}

// LeetCode Discuss solution

public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}