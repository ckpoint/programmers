package com.algorithm.study.day7;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_01() {
        int result = this.solution.solution(new int[]{3, 1, 6, 2, 7, 30, 1});
        Assert.assertEquals(result, 21);
    }
}
