
class Solution {
    public int romanToDecimal(String s) {
        // code here
        int sum = 0;
        int prev = 0;
        
        for(int i = 0;i < s.length(); i++) {
            int cur = stringToInteger(s.charAt(i));
            
            if(cur > prev) {
                sum += cur - (2 * prev);
            } else {
                sum = sum + cur;
            }
            
            prev = cur;
        }
        
        return sum;
    }
    public int stringToInteger(char s) {
        switch (s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
