package com.algorithm.study.day24;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void solution() {
        assertThat(solution.solution(1041 ), is(5));

    }
    @Test
    public void solution2() {
        assertThat(solution.solution(15 ), is(0));
    }
    @Test
    public void solution3() {
        assertThat(solution.solution(32 ), is(0));

    }
    @Test
    public void solution4() {
        assertThat(solution.solution(328 ), is(2));

    }
}
