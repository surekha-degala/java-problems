import java.util.Scanner;

class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        int r = 2;
        // Compute and Print
        int res = a* (int) Math.pow(r, n-1);
        System.out.println(res);
    }
}
