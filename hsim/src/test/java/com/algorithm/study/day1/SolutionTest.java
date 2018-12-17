package com.algorithm.study.day1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testcast_1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"leo", "kiki"};

        Solution solution = new Solution();

        assertEquals(solution.solution(participant, completion), "eden");
    }

    @Test
    public void testcast_2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"marina", "josipa", "nikola", "filipa"};

        Solution solution = new Solution();

        assertEquals(solution.solution(participant, completion), "vinko");
    }

    @Test
    public void testcast_3() {
        String[] participant = {"marina", "marina", "josipa", "nikola", "filipa"};
        String[] completion = {"marina", "josipa", "nikola", "filipa"};

        Solution solution = new Solution();

        assertEquals(solution.solution(participant, completion), "marina");
    }
}
