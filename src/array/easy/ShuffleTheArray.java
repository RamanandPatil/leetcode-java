package array.easy;

import java.util.Arrays;

/**
 * <h1><a href="https://leetcode.com/problems/shuffle-the-array/">
 * 1470. Shuffle the Array</a></h1>
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        if (nums == null || nums.length == 0 || nums.length != (2 * n)) {
            return new int[]{};
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i += 2) {
            result[i] = nums[i / 2];
            result[i + 1] = nums[n + i / 2];
        }
        return result;
    }

    public static void main(String[] args) {
        ShuffleTheArray shuffle = new ShuffleTheArray();
        int[] input = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle.shuffle(input, 3)));

        input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(shuffle.shuffle(input, 4)));
    }
}
