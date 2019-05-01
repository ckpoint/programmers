package com.algorithm.study.day12;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void Merge() {
        Solution solution = new Solution();

        int[] merge = solution.merge(5, new int[]{1, 3}, new int[]{2});

        Assertions.assertThat(merge[0]).isEqualTo(0);
        Assertions.assertThat(merge[1]).isEqualTo(2);
        Assertions.assertThat(merge[2]).isEqualTo(0);
        Assertions.assertThat(merge[3]).isEqualTo(1);
        Assertions.assertThat(merge[4]).isEqualTo(1);
    }

    @Test
    public void solution() {
        Solution solution = new Solution();
        int result = solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});

        Assertions.assertThat(result).isEqualTo(5);
    }


    @Test
    public void solution2() {
        Solution solution = new Solution();
        int result = solution.solution(5, new int[]{2, 4}, new int[]{3});

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void solution3() {
        Solution solution = new Solution();
        int result = solution.solution(3, new int[]{3}, new int[]{1});

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void solution4() {
        Solution solution = new Solution();
        int result = solution.solution(6, new int[]{1,2,3}, new int[]{4,5,6});

        Assertions.assertThat(result).isEqualTo(4);
    }


    @Test
    public void solution5() {
        Solution solution = new Solution();
        int result = solution.solution(3, new int[]{1,2}, new int[]{2,3});

        Assertions.assertThat(result).isEqualTo(2);
    }


    @Test
    public void solution6() {
        Solution solution = new Solution();
        int result = solution.solution(1, new int[]{1}, new int[]{1});

        Assertions.assertThat(result).isEqualTo(1);
    }
}