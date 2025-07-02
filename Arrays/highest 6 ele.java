7

 Open in editor

1
import java.io.*;
2
import java.util.*;
3
import java.text.*;
4
import java.math.*;
5
import java.util.regex.*;
6
​
7
public class Solution {
8
​
9
    public static void main(String[] args) {
10
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
11
        Scanner sc = new Scanner(System.in);
12
        int n = sc.nextInt();
13
        int [] arr = new int [n];
14
        for (int i =0; i<n;i++) {
15
            arr[i] = sc.nextInt();
16
        }
17
        Arrays.sort(arr);
18
        int size = Math.min(6,n);
19
        int sum =0;
20
        for (int i =0; i<size; i++) {
21
            sum += arr[n-i-1];
22
            
23
          
24
        }
25
        System.out.println(sum);
26
    }
27
}
