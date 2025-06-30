// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int min = Integer.MAX_VALUE;
        int max = 0;
        for ( int i =0; i<prices.length;i++) {
            if ( prices[i] < min ) {
                min = prices[i];
            } else if (prices[i]- min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
