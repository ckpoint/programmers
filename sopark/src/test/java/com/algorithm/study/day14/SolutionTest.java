package com.algorithm.study.day14;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{1,3,0,1}));
    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{4,4,4,3,3});
        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{4,3}));
    }


    @Test
    public void solution3() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0,1,0,1});
        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{0,1,0,1}));
    }

}