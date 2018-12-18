package com.algorithm.study.day3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day3Test {
    SolutionDay3 solutionDay3 = new SolutionDay3();

    @Test
    public void testEmpty(){
        assertThat(solutionDay3.solution(new int[]{}),  is(new int[]{}));
    }

    @Test
    public void test1(){
        int[] solution = solutionDay3.solution(new int[]{1, 2, 3, 4, 5});
        assertThat(solutionDay3.getAnswer1Count(),  is(5));
        assertThat(solutionDay3.getAnswer2Count(),  is(0));
        assertThat(solutionDay3.getAnswer3Count(),  is(0));
        assertThat(solution,is(new int[]{1}));
    }
    @Test
    public void test2(){
        int[] solution = solutionDay3.solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3});
        assertThat(solutionDay3.getAnswer1Count(),  is(13));
        assertThat(solutionDay3.getAnswer2Count(),  is(1));
        assertThat(solutionDay3.getAnswer3Count(),  is(1));
        assertThat(solution,is(new int[]{1}));
    }
    @Test
    public void test3(){
        int[] solution = solutionDay3.solution(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        assertThat(solutionDay3.getAnswer1Count(),  is(1));
        assertThat(solutionDay3.getAnswer2Count(),  is(8));
        assertThat(solutionDay3.getAnswer3Count(),  is(1));
        assertThat(solution,is(new int[]{2}));
    }
    @Test
    public void test4(){
        int[] solution = solutionDay3.solution(new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5});
        assertThat(solutionDay3.getAnswer1Count(),  is(2));
        assertThat(solutionDay3.getAnswer2Count(),  is(16));
        assertThat(solutionDay3.getAnswer3Count(),  is(3));
        assertThat(solution,is(new int[]{2}));
    }
    @Test
    public void test5(){
        int[] solution = solutionDay3.solution(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2});
        assertThat(solutionDay3.getAnswer1Count(),  is(1));
        assertThat(solutionDay3.getAnswer2Count(),  is(3));
        assertThat(solutionDay3.getAnswer3Count(),  is(16));
        assertThat(solution,is(new int[]{3}));
    }
}


