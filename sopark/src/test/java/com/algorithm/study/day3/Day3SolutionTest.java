package com.algorithm.study.day3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Day3SolutionTest {

    @Test
    public void solution_첫번째사람만많이맞출때() {
        // Given
        int[] answer = {1,1,2,4,5};

        // When
        Day3Solution solution = new Day3Solution();
        int[] result = solution.solution(answer);

        // Then
        assertThat("여러개 정답중 1개만 맞출경", result[0], is(1));
    }

    @Test
    public void solution_두번재사람만많이맞출때() {
        // Given
        int[] answer = {2};

        // When
        Day3Solution solution = new Day3Solution();
        int[] result = solution.solution(answer);

        // Then
        assertThat("가운데 사람만 1개 맞출때", result[0], is(2));
    }

    @Test
    public void solution_마지막사람만많이맞출때() {
        // Given
        int[] answer = {3,3,1,1,2,2,4,5,5};

        // When
        Day3Solution solution = new Day3Solution();
        int[] result = solution.solution(answer);

        // Then
        assertThat("가장 많이 맞춘 사람은 3번하나", result[0], is(3));
    }


    @Test
    public void solution_모두맞춘갯수가같을때() {
        // Given
        int[] answer = {1,3,2,4,2};

        // When
        Day3Solution solution = new Day3Solution();
        int[] result = solution.solution(answer);

        // Then
        assertThat("가장 많이 맞춘 사람은 1번", result[0], is(1));
        assertThat("가장 많이 맞춘 사람은 2번", result[1], is(2));
        assertThat("가장 많이 맞춘 사람은 3번", result[2], is(3));
    }

    @Test
    public void solution_모두못맞췄을때() {
        // Given
        int[] answer = {4,4,4,5};

        // When
        Day3Solution solution = new Day3Solution();
        int[] result = solution.solution(answer);

        // Then
        assertThat("모두 못맞췄을때", result, is(new int[]{}));
    }


    @Test
    public void solution_두번째와세번째사람이가장많이맞출때() {
        // Given
        int[] answer = {3,1};

        // When
        Day3Solution solution = new Day3Solution();
        int[] result = solution.solution(answer);

        // Then
        assertThat("두번째 사람", result[0], is(2));
        assertThat("세번째 사람", result[1], is(3));
    }
}