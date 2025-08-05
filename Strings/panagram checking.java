// User function Template for Java

class Solution {

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str) {
        // Check if given string is panagram
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if(str.indexOf(ch)== -1) {
                return false;
            } 
            }
            return true;
        }
    }
