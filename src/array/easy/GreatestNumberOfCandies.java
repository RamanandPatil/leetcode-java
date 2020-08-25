package array.easy;

import java.util.List;

/**
 * <h1><a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/">
 * 1431. Kids With the Greatest Number of Candies</a></h1>
 */
public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length == 0) {
        }
        return null;
    }

    public static void main(String[] args) {
        GreatestNumberOfCandies candies = new GreatestNumberOfCandies();
        int[] input = {2, 5, 1, 3, 4, 7};
        System.out.println(candies.kidsWithCandies(input, 3));

        input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(candies.kidsWithCandies(input, 4));
    }
}
