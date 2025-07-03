class Solution {
    public boolean isArmstrong(int n) {
        int tsum =0;
        int ori =n;
        while (n>0) {
            int ld = n %10;
            tsum += ld *ld*ld;
            n = n/10;
            
        }
        return tsum == ori;
    }
}
