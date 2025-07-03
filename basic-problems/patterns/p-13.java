public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        for (int i =0; i<n;i++) {
            // char ch = 'A'+i;
            for (int j =0; j<=i;j++) {
                System.out.print((char)(int)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}
