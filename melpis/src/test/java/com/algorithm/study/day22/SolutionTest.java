package com.algorithm.study.day22;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{1,1,1,1,1}, 3), is(5));

    }
}