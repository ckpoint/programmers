package com.algorithm.study.day18;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[][] result = solution.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
        assertThat(Arrays.deepToString(result)).isEqualTo(Arrays.deepToString(new int[][]{{4,6},{7,9}}));
    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        int[][] result = solution.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}});
        assertThat(Arrays.deepToString(result)).isEqualTo(Arrays.deepToString(new int[][]{{4},{6}}));
    }
}