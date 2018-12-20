package com.algorithm.study.day4;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void 케이스1(){
        // Given
        int input = 0;

        // When
        Solution solution = new Solution();
        String result = solution.solution(1);

        // Then
        assertThat("1인 케이스", result, is("수"));
    }

    @Test
    public void 케이스_3(){
        // Given
        int input = 0;

        // When
        Solution solution = new Solution();
        String result = solution.solution(3);

        // Then
        assertThat("3인값에 대해서는", result, is("수박수"));
    }

    @Test
    public void 케이스_4(){
        // Given
        int input = 0;

        // When
        Solution solution = new Solution();
        String result = solution.solution(4);

        // Then
        assertThat("3인값에 대해서는", result, is("수박수박"));
    }


    @Test
    public void 케이스_5(){
        // Given
        int input = 0;

        // When
        Solution solution = new Solution();
        String result = solution.solution(5);

        // Then
        assertThat("3인값에 대해서는", result, is("수박수박수"));
    }
}
