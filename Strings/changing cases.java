class Solution {
    public static void changeCase(String s) {
        // code here
        String cap = s.substring (0,1).toUpperCase() + s.substring(1);
        System.out.println(cap);
        String upp = s.substring(0).toUpperCase();
        System.out.println(upp);
        
    }
}
