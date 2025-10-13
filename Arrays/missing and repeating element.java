class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        // code here
        int repeating = -1;
        long totalsum  =(long) (n*(n+1))/2;
        long sum = 0;
        HashSet<Integer> set = new HashSet<>();
    
        for (int num : arr) {
            if(!set.add(num)) {
                 
                repeating = num;
            }
                sum +=num;
            
        }
            int missing = (int)(totalsum-(sum- repeating));
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }
}
