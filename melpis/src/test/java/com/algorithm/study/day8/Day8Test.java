package com.algorithm.study.day8;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day8Test {

     private Solution solution = new Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(new int[]{1,2,3,4,5}, new int[][]{{1,1,1}}),  is(new int[]{1}));
    }
    @Test
    public void test2(){
        assertThat(solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}),  is(new int[]{5, 6, 3}));
    }

}


