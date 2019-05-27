package com.algorithm.study.day22;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        // Given
        Solution solution = new Solution();

        // When
        boolean result = solution.solution(new String[]{"119", "97674223", "1195524421"});

        // Then
        assertThat(result).isFalse();
    }


    @Test
    public void solution2() {
        // Given
        Solution solution = new Solution();

        // When
        boolean result = solution.solution(new String[]{"123","456","789"});

        // Then
        assertThat(result).isTrue();
    }


    @Test
    public void solution3() {
        // Given
        Solution solution = new Solution();

        // When
        boolean result = solution.solution(new String[]{"12","123","1235","567","88"});

        // Then
        assertThat(result).isFalse();
    }

    @Test
    public void solution4() {
        // Given
        Solution solution = new Solution();

        // When
        boolean result = solution.solution(new String[]{"1235", "123","567","88"});

        // Then
        assertThat(result).isFalse();
    }
}
