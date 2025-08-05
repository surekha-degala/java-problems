// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i= 0; i<s2.length(); i++) {
            char ch = s2.charAt(i);
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i <s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
            }
            if (map.get(ch)== 0) {
                map.remove(ch);
            }
        }
        for (char ch : map.keySet()) {
        return ch;
        }
        return '0';
    }
}
