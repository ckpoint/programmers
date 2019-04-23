package com.algorithm.study.day21;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{1,7,5,9,2,12,3}, 2), is(4));
    }
    @Test
    public void solution2() {
        assertThat(solution.solution2(new int[]{1,7,5,9,2,12,3}, 2), is(4));
    }
    @Test
    public void solution3() {
        assertThat(solution.solution3(new int[]{1,7,5,9,2,12,3}, 2), is(4));
    }
}
