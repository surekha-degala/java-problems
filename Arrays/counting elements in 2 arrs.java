class Solution {
    public ArrayList<Integer> countLessEq(int[] a, int[] b) {
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a) {
            int count = upperBound(b, num);
            result.add(count);
        }

        return result;
    }

    // Helper method to find the count of elements <= target using binary search
    private int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
