/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

// "for every num, check every num" solution --> O(n^2)
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; ++i) {
        for (int j = 0; j < nums.length; ++j) {
            if (j != i) {
                if (nums[i] + nums[j] == target) {
                    int[] mysol = {i, j};
                    return mysol;
                }
            }// if not same index
        }// for j 
    }// for i 

    int[] test = {0};
    return test;
}// two sum

// "for every num, check every num" solution --> O(n^2)
public int[] twoSum2(int[] nums, int target) {
    // TODO: work on me
}// two sum