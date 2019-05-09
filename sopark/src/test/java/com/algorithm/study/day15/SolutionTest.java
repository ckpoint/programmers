package com.algorithm.study.day15;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 1, 1, 1, 1}, 3);
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 1, 1}, 3);
        Assertions.assertThat(result).isEqualTo(1);
    }


    @Test
    public void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1,1,1,1,1}, 1);
        Assertions.assertThat(result).isEqualTo(10);
    }
}