import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n==0) {
            System.out.print(0);
            return;
        }
        if (n==1) {
            System.out.print(1);
            return;
        }
        int pre2 = 0;
        int pre1 =1;
        int curr = 0;
        for (int i =2; i<=n; i++) {
            curr = pre2 +pre1;
            pre2 = pre1;
            pre1 = curr;
        }
        System.out.println(curr);
    }
}
