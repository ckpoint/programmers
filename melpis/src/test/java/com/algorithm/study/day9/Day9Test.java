package com.algorithm.study.day9;

import com.algorithm.study.day9.Solution;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day9Test {

     private Solution solution = new Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(new int[][]{{123, 0, 0},{456,0,0},{789,3,0}}),  is(1));
    }
    @Test
    public void test2(){
        assertThat(solution.solution(new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}}),  is(2));
    }

    @Test
    public void test3(){
        assertThat(solution.solution(new int[][]{{123, 0, 0}, {356, 1, 0}, {327, 0, 0}, {489, 1, 1}, {923,0,0}, {648,1,1}}),  is(1));
    }
}


