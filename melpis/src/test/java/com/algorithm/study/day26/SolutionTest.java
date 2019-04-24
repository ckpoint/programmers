package com.algorithm.study.day26;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void lengthOfLongestSubstring() {
        assertThat(solution.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }
}