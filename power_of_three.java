/* Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
*/

// FIXME: this does not pass all edge cases
public boolean isPowerOfThree(int n) {
    if (n == 1) {
        return true;
    }
    while (n >= 3) {
        if (n == 3) {
            return true;
        }
        n /= 3;
    }// while 
    return false;
}