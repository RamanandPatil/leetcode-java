package array.easy;

import java.util.Arrays;

/**
 * <h1><a href="https://leetcode.com/problems/running-sum-of-1d-array/">
 * 1480. Running Sum of 1d Array</a></h1>
 */
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray rsoa = new RunningSumOf1dArray();
        int[] input = {1,2,3,4};
        System.out.println(Arrays.toString(rsoa.runningSum(input)));

        input = new int[]{1,1,1,1,1};
        System.out.println(Arrays.toString(rsoa.runningSum(input)));
    }
}
