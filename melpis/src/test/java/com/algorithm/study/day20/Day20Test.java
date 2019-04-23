package com.algorithm.study.day20;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day20Test {

    private Solution solution = new Solution();


    @Test
    public void test1() {
        assertThat(solution.solution( new String[]{"I 16","D 1"}), is(new int[]{0,0}));
    }
    @Test
    public void test2() {
        assertThat(solution.solution( new String[]{"I 7","I 5","I -5","D -1"}), is(new int[]{7,5}));
    }
  @Test
    public void test3() {
        assertThat(solution.solution( new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}), is(new int[]{333,-45}));
    }
    @Test
    public void test4() {
        assertThat(solution.solution( new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}), is(new int[]{0,0}));
    }






}