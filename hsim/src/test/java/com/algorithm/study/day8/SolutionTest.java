package com.algorithm.study.day8;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test_01() {
        Solution solution = new Solution();

        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3} };

        int[] results = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, commands);

        Assert.assertTrue(results.length == 3);
        Assert.assertTrue(results[0] == 5);
        Assert.assertTrue(results[1] == 6);
        Assert.assertTrue(results[2] == 3);
    }
}
