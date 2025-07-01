class Solution {
    public int reverseNumber(int n) {
        String s = Integer.toString(n);
        String reverse = new StringBuilder(s).reverse().toString();

        return Integer.parseInt(reverse);
    }
}
