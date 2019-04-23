package com.algorithm.study.day19;


import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day19Test {

    private Solution solution = new Solution();


    @Test
    public void test1() {
        assertThat(solution.solution(6, new int[]{7,10}), is(28L));
    }
    @Test
    public void test2() {
        assertThat(solution.solution(1, new int[]{7,10}), is(7L));
    }
    @Test
    public void test3() {
        assertThat(solution.solution(2, new int[]{7,10}), is(10L));
    }
    @Test
    public void test4() {
        assertThat(solution.solution(3, new int[]{7,10}), is(14L));
    }
    @Test
    public void test5() {
        assertThat(solution.solution(4, new int[]{7,10}), is(20L));
    }
    @Test
    public void test6() {
        assertThat(solution.solution(5, new int[]{7,10}), is(21L));
    }


}