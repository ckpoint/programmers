package com.algorithm.study.day9;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolution_01() {
        Solution solution = new Solution();
        int[][] input = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        int result = solution.solution(input);

        Assert.assertTrue(result == 2);
    }
}
