public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 121; // You can change this to test other numbers
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
//edited this again ;
 class Solution {
    public boolean isPalindrome(int n) {
        int reversed =0;
        int ori = n;
        while (n>0 ) {
            int ld = n %10;
            reversed = (reversed *10) +ld;
            
            n =n/10;
        }
        return ori == reversed;
    }
}
