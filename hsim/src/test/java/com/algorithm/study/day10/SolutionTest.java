package com.algorithm.study.day10;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertTrue(solution.solution(new int[]{6, 10, 2}).equals("6210"));

        System.out.println(solution.solution(new int[]{3, 30, 34, 5, 9}));
        Assert.assertTrue(solution.solution(new int[]{3, 30, 34, 5, 9}).equals("9534330"));
        Assert.assertTrue(solution.solution(new int[]{0,0,0,0,0,0,0,0,0,0}).equals("0"));
    }
}
