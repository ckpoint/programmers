package com.algorithm.study.day31;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{93,30,55},new int[]{1,30,5}), is(new int[]{}));
    }
}