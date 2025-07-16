class Solution {
    public int getSecondLargest(int[] arr) {
        //de here
        int n = arr.length;
        int largest = -1; int secondLargest = -1;
        for ( int i =0; i <n; i++) {
            if ( arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        for ( int i = 0 ; i<n ;i++) { 
            if (arr[i] > secondLargest && arr[i]!= largest) {
                secondLargest = arr[i];
            }
    }
    return secondLargest;
}
}

class Solution {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
