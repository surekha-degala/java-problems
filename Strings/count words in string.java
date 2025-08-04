// User function Template for Java

class Solution {
 
    public static int countWords(String str) {
    
        if (str == null || str.isEmpty()) { return 0; }
        return str.split(" ").length;
        }
}
