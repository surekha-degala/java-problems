class Solution {
    public int[] divisors(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i<=n; i++ ) {
            if (n %i ==0) {
                li.add(i);
            }

        }
        int [] res = new int[li.size()];
        for (int i =0; i<li.size(); i++) {
            res[i] = li.get(i);
        }
        return res;
    }
}
