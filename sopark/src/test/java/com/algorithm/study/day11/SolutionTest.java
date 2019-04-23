package com.algorithm.study.day11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void case1() {
        String[] data = {"I 16","D 1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {0, 0};
        Assertions.assertThat(solution).isEqualTo(result);
    }

    @Test
    public void case2() {
        String[] data = {"I 7","I 5","I -5","D -1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {7, 5};
        Assertions.assertThat(solution).isEqualTo(result);
    }

    @Test
    public void case3() {
        String[] data = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {0, -0};
        Assertions.assertThat(solution).isEqualTo(result);
    }


    @Test
    public void case4() {
        String[] data = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {333, -45};
        Assertions.assertThat(solution).isEqualTo(result);
    }

    @Test
    public void case5() {
        String[] data = {"I 45"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {45, 45};
        Assertions.assertThat(solution).isEqualTo(result);
    }

    @Test
    public void case6() {
        String[] data = {"D -1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {0, 0};
        Assertions.assertThat(solution).isEqualTo(result);
    }


    @Test
    public void case7() {
        String[] data = {"I 45", "I 30", "D 1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {30, 30};
        Assertions.assertThat(solution).isEqualTo(result);
    }

    @Test
    public void case8() {
        String[] data = {"I 45", "I 45", "I 45", "I 30", "I 30", "D 1", "D -1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {45, 30};
        Assertions.assertThat(solution).isEqualTo(result);
    }

    @Test
    public void case9() {
        String[] data = {"D 1", "D -1"};
        int[] solution = new Solution().solution(data);

        Integer[] result = {0, 0};
        Assertions.assertThat(solution).isEqualTo(result);
    }
}