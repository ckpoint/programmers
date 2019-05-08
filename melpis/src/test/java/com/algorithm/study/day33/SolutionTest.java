package com.algorithm.study.day33;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution1() {
        assertThat(solution.solution(4, new int[]{4,10,15}, new int[]{20,5,10},30), is(2));
    }   @Test
    public void solution2() {
        assertThat(solution.solution(4, new int[]{4,10,15}, new int[]{20,5,10},10), is(1));
    }
    @Test
    public void solution3() {
        assertThat(solution.solution(4, new int[]{1,2,3,4}, new int[]{10, 40, 30, 20},100),is(4));
    }
}