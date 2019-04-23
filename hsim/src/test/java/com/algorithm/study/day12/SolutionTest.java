package com.algorithm.study.day12;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test_01() {

        Solution solution = new Solution();

        int[] result = solution.solution(new String[]{"l 16", "D 1"});
        Assert.assertTrue(result[0] == 0 && result[1] == 0);

    }


    @Test
    public void test_02() {

        Solution solution = new Solution();

        int[] result = solution.solution(new String[]{"I 7", "I 5", "I -5", "D -1"});
        Assert.assertTrue(result[0] == 7 && result[1] == 5);

    }

    @Test
    public void test_03() {

        Solution solution = new Solution();

        int[] result = solution.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
        Assert.assertTrue(result[0] == 333 && result[1] == -45);

    }
}
