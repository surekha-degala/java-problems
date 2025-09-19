import java.util.*;
class Solution {
    public int mean(int[] arr) {
        // code here
        int mean = 0;
        
        for (int val : arr ) {
            mean += val;
            
        }
        return (mean/arr.length);
    }

    public int median(int[] arr) {
        Arrays.sort(arr);
        int median = 0;
        int mid = arr.length/2 ;
        if (arr.length%2 == 0) {
            median = (arr[mid] + arr[mid-1])/2;
        }else {
            median = arr[mid];
        }
        return (median);
        // code here
    }
}
