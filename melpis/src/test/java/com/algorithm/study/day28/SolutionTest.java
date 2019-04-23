package com.algorithm.study.day28;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(new int[]{1, 2, 3, 9, 10, 12},7)).isEqualTo(2);
        assertThat(solution.solution(new int[]{0,0,1},2)).isEqualTo(2);
    }
}