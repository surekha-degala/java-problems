// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        n = n+1;
        while(true) {
        boolean isPrime = true;
            for (int i = 2; i<n;i++) {
                if (n%i ==0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                return n;
            }
                
            
            n+=1;
        }
    }
}
