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
//using hash set

// User function Template for Java

class Solution {

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str) {
        // Check if given string is panagram
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()) {
            if (Character.isLetter(ch) ){
                set.add(ch);
            }
        }
        return set.size() == 26 ? true : false;
    }
}
