class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        int i = 2;
        while (i*i <=n) {
            while (n%i == 0) {
                System.out.print(i+ " ");
                n /= i;
            }
            i++;
        }
        if (n >1) {
            System.out.print(n);
        }
    }
}
