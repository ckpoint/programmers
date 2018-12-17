package com.algorithm.study.day3;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    private Solution solution = new Solution();


    @Test
    public void test_01() {
        int[] result = solution.solution(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(result.length , 1);
        Assert.assertEquals(result[0], 1);

    }

    @Test
    public void test_02() {

        int[] result = solution.solution(new int[]{1,3,2,4,2});


        Assert.assertEquals(result.length , 3);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 2);
        Assert.assertEquals(result[2], 3);
    }
}
