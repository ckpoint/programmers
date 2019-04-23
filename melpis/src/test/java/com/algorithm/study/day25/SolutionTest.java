package com.algorithm.study.day25;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void twoSum() {
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15},9)).isEqualTo(new int[]{0, 1});
    }
    @Test
    public void twoSum2() {
        assertThat(solution.twoSum(new int[]{3,3},6)).isEqualTo(new int[]{0, 1});
    }


}