import java.util.*;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        int count1 = 0, count2 = 0;
        int cd1 = 0, cd2 = 1; 

     
        for (int num : nums) {
            if (num == cd1) count1++;
            else if (num == cd2) count2++;
            else if (count1 == 0) {
                cd1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cd2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

     
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == cd1) count1++;
            else if (num == cd2) count2++;
        }

        
        List<Integer> li = new ArrayList<>();
        if (count1 > n / 3) li.add(cd1);
        if (count2 > n / 3) li.add(cd2);

        Collections.sort(li); 
        return li;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(sol.majorityElement(arr)); 
    }
}
