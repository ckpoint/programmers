package com.algorithm.study.day34;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void solution() {
        assertThat(solution.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"} ), is(new int[]{3,3}));
    }
    @Test
    public void solution2() {
        assertThat(solution.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"} ), is(new int[]{1,3}));
    }
    @Test
    public void solution3() {
        assertThat(solution.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
                "establish", "hang", "gather", "refer", "reference", "estimate", "executive"} ), is(new int[]{0,0}));
    } @Test
    public void solution4() {
        assertThat(solution.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "bot", "tank"} ), is(new int[]{2,3}));
    }
}