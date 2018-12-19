package com.algorithm.study.day100;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_01() {

        long result = this.solution.solution(new int[][]{{0, 1, 4, 4}, {3, 1, 5, 3}});

        Assert.assertEquals(result, 14);
    }


    @Test
    public void test_02() {

        long result = this.solution.solution(new int[][]{{1, 1, 6, 5}, {2, 0, 4, 2}, {2, 4, 5, 7}, {4, 3, 8, 6}, {7, 5, 9, 7}});
        Assert.assertEquals(result, 38);
    }
}
