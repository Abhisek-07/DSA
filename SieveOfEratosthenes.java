class SieveOfEratosthenes {
    static void sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n + 1];
        
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            
            if (prime[i] == true) {
                for (int j = 2; i*j <= n; j++)
                    prime[i*j] = false;
            }
        }
 
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
    public static void main (String[] args) {
        sieveOfEratosthenes(19);
    }
}
