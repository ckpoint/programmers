package com.algorithm.study.day31;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{93,30,55},new int[]{1,30,5}), is(new int[]{2,1}));
    }
  @Test
    public void solution2() {
        assertThat(solution.solution(new int[]{15, 1, 14, 9, 29, 25, 17, 24, 4, 27, 7, 19, 29, 14, 23, 4, 21, 3, 8, 14},new int[]{9, 11, 21, 16, 11, 21, 7, 5, 6, 30, 11, 24, 26, 18, 20, 18, 15, 30, 7, 18}), is(new int[]{6, 1, 13}));
    }
}