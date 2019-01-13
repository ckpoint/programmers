package com.algorithm.study.day7;


import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day7Test {

     private Solution solution = new Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(new int[]{1}),  is(2));
    }
    @Test
    public void test11(){
        assertThat(solution.solution(new int[]{1,1}),  is(3));
    }

    @Test
    public void test12(){
        assertThat(solution.solution(new int[]{1,2}),  is(4));
    }
    @Test
    public void test123(){
        assertThat(solution.solution(new int[]{1,2,3}),  is(7));
    }
    @Test
    public void test1123(){
        assertThat(solution.solution(new int[]{1,1,2,3}),  is(8));
    }
    @Test
    public void test1234(){
        assertThat(solution.solution(new int[]{1,2,3,4}),  is(11));
    }


    @Test
    public void test31627301(){
        assertThat(solution.solution(new int[]{3, 1, 6, 2, 7, 30, 1}),  is(21));
    }


}


