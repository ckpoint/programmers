package com.algorithm.study.day27;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution("17")).isEqualTo(3);
        assertThat(solution.solution("011")).isEqualTo(2);
    }
}