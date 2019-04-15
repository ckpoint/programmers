package com.algorithm.study.day7;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void solution_1개일경우() {
        // Given
        int[] input = {1};

        // When
        int result = this.solution.solution(input);

        // Then
        assertThat("최소정수는2", result, is(2));
    }

    @Test
    public void solution_3개일경우(){
        // Given
        int[] input = {1,1,3};

        // When
        int result = this.solution.solution(input);

        // Then
        assertThat("최소정수는5", result, is(5));
    }

    @Test
    public void solution_7개일경우(){
        // Given
        int[] input = {3, 1, 6, 2, 7, 30, 1};

        // When
        int result = this.solution.solution(input);

        // Then
        assertThat("최소정수는21", result, is(21));
    }
}