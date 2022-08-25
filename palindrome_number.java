/*
 Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 */

public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int rem = 0;

    while (x) {
        rem = x % 10;
        

        x /= 10;
    }// while x not zero
}