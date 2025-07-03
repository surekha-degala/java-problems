class Solution {
    public int reverseNumber(int n) {
        String s = Integer.toString(n);
        String reverse = new StringBuilder(s).reverse().toString();

        return Integer.parseInt(reverse);
    }
}

class Solution {
  public int reverseNumber(int n) {
    int rev =0;
    while (n>0) {
    
        int ld = n%10;
        rev = (rev * 10) +ld;
        n = n/10;
    }
return rev;
  }
}
