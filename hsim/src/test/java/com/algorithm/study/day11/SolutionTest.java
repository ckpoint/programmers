package com.algorithm.study.day11;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {


    @Test
    public void test_01() {
        Solution solution = new Solution();
        int res = solution.solution(3, splitStrs("Jeju, Pangyo, Seoul, NewYork, LA, Jeju, Pangyo, Seoul, NewYork, LA"));
        Assert.assertTrue(res == 50);
    }

    @Test
    public void test_02() {
        Solution solution = new Solution();
        int res = solution.solution(3, splitStrs("Jeju, Pangyo, Seoul, Jeju, Pangyo, Seoul, Jeju, Pangyo, Seoul"));
        Assert.assertTrue(res == 21);
    }

    @Test
    public void test_03() {
        Solution solution = new Solution();
        int res = solution.solution(2, splitStrs("Jeju, Pangyo, Seoul, NewYork, LA, SanFrancisco, Seoul, Rome, Paris, Jeju, NewYork, Rome"));
        Assert.assertTrue(res == 60);
    }

    @Test
    public void test_04() {
        Solution solution = new Solution();
        int res = solution.solution(5, splitStrs("Jeju, Pangyo, Seoul, NewYork, LA, SanFrancisco, Seoul, Rome, Paris, Jeju, NewYork, Rome"));
        Assert.assertTrue(res == 52);
    }

    @Test
    public void test_05() {
        Solution solution = new Solution();
        int res = solution.solution(2, splitStrs("Jeju, Pangyo, NewYork, newyork"));
        Assert.assertTrue(res == 16);
    }

    @Test
    public void test_06() {
        Solution solution = new Solution();
        int res = solution.solution(0, splitStrs("Jeju, Pangyo, Seoul, NewYork, LA"));
        Assert.assertTrue(res == 25);
    }



    private String[] splitStrs(String str) {
        String[] results = str.split(",");
        for (String result : results) {
            result = result.trim();
        }
        return results;
    }
}
