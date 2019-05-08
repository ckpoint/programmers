package com.algorithm.study.day16;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{2,1}));
    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{93, 30, 55}, new int[]{100, 100, 100});

        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{3}));
    }

    @Test
    public void solution3() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1}, new int[]{1});

        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{1}));
    }


    @Test
    public void solution4() {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{50,50,50}, new int[]{3,2,1});

        Assertions.assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{1,1,1}));
    }
}