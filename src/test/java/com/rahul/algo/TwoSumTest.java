package com.rahul.algo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    void testTwoSumSuccess() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result, "Indices should match 0 and 1");
    }

    @Test
    void testTwoSumNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result.length, "Should return empty array when no solution");
    }
}
