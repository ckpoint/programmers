package com.algorithm.study.day10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        // Given
        String[] data = {"a"};

        // When
        int result = new Solution().solution(0, data);

        // Then
        Assertions.assertThat(result).isEqualTo(5);
    }


    @Test
    public void solution2() {
        // Given
        String[] data = {"a", "a"};

        // When
        int result = new Solution().solution(1, data);

        // Then
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void solution3() {
        // Given
        String[] data = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        // When
        int result = new Solution().solution(3, data);

        // Then
        Assertions.assertThat(result).isEqualTo(50);
    }


    @Test
    public void solution4() {
        // Given
        String[] data = {"Jeju", "Pangyo", "NewYork", "newyork"};

        // When
        int result = new Solution().solution(2, data);

        // Then
        Assertions.assertThat(result).isEqualTo(16);
    }

    @Test
    public void solution5(){
        // Given
        String[] data = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        // When
        int result = new Solution().solution(5, data);

        // Then
        Assertions.assertThat(result).isEqualTo(52);

    }
}