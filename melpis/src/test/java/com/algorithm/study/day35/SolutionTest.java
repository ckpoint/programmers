package com.algorithm.study.day35;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void solution() {
        assertThat(solution.solution2(new int[]{70, 50, 80, 50},100),is(3));
        assertThat(solution.solution(new int[]{40,40,40},100),is(2));
    }
}