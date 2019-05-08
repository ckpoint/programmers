package com.algorithm.study.day32;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{1,3,2,5,4},9), is(3));
    }
    @Test
    public void solution2() {
        assertThat(solution.solution(new int[]{2,2,3,3},10), is(4));
    }
}