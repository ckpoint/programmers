package com.algorithm.study.day13;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int result = solution.solution(123);
        Assertions.assertThat(result).isEqualTo(6);
    }


    @Test
    public void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(987);
        Assertions.assertThat(result).isEqualTo(24);
    }

    @Test
    public void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(100000000);
        Assertions.assertThat(result).isEqualTo(1);
    }
}