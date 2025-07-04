class Solution {
    public int closestNumber(int n, int m) {
        if (m == 0) return n;

        int q = n / m;

        int n1 = m * q;       // Lower or equal multiple
        int n2 = m * (q + 1); // Next higher multiple

        int diff1 = Math.abs(n - n1);
        int diff2 = Math.abs(n - n2);

        if (diff1 < diff2) {
            return n1;
        } else if (diff2 < diff1) {
            return n2;
        } else {
            // Tie in distance → return one with greater absolute value
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
        }
    }
}
