package com.algorithm.study.day23;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{2, 1, 3, 2}, 2), is(1));

    }
    @Test
    public void solution2() {
        assertThat(solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0), is(5));

    }
}