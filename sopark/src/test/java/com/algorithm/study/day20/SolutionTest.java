package com.algorithm.study.day20;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int result = solution.solution("(())");

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        int result = solution.solution("(())()");

        assertThat(result).isEqualTo(2);
    }


    @Test
    public void solution3() {
        Solution solution = new Solution();
        int result = solution.solution("((()))");

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void solution4() {
        Solution solution = new Solution();
        int result = solution.solution("(()())");

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void solution10() {
        Solution solution = new Solution();
        int result = solution.solution("()(((()())(())()))(())");
        assertThat(result).isEqualTo(17);
    }
}