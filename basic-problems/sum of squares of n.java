// User function Template for Java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int n) {
        // code here
        long sum =0;
        for (int i =0; i<=n;i++) {
            sum += (int) i*i;
        }
        return(int) sum;
    }
}
