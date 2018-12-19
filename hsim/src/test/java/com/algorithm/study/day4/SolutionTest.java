package com.algorithm.study.day4;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_01() {
        Assert.assertEquals(solution.solution(3), "수박수");
    }

    @Test
    public void test_02() {
        Assert.assertEquals(solution.solution(4), "수박수박");
    }

}
