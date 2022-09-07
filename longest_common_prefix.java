/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ""
 */

public String longestCommonPrefix(String[] strs) {
    String[] full_arr = new String[strs[0].length];
    String cur = "";
    for (int i = 0; i < strs[0].length; ++i) {
        cur += strs[0][i];
        full_arr[i] = cur;
    }
    for (int i = 1; i < strs.length; ++i) {
        cur = "";
        for (int j = 0; j < strs[i].length; ++j) {
            if (j < full_arr.length) {
                cur += strs[i][j];
                if (cur != full_arr[J]) {
                    // erase range in array
                    break;
                }// clear 
            }// if space FIXME
        }// for j 
    }// for i       
}
