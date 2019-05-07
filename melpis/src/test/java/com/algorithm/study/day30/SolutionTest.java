package com.algorithm.study.day30;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(2,10, new int[]{7,4,5,6}),is(8));

    } @Test
    public void solution2() {
        assertThat(solution.solution(100, 100, new int[]{10}), is(101));
    } @Test
    public void solution3() {
        assertThat(solution.solution(100,100, new int[]{10,10,10,10,10,10,10,10,10,10}),is(110));
    }
}