class Solution {
    public int GCD(int n1, int n2) {
        int a = n1;
        int b = n2;
       while (a>0 && b>0) {
        if (a>b) {
            a = a%b;
        } else {
            b = b%a;
        }
       }
       if (a==0) {
        return b;
       }else {
        return a;
       }
    }
}
