package com.algorithm.study.day21;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        // Given
        Solution solution = new Solution();

        // When
        int result = solution.solution(new int[]{2, 1, 3, 2}, 2);

        // Then
        assertThat(result).isEqualTo(1);
    }
}
