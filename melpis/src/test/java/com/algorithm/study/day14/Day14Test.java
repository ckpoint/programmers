package com.algorithm.study.day14;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day14Test {

     private com.algorithm.study.day14.Solution solution = new com.algorithm.study.day14.Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(5,	new int[]{2, 4},new int[]{1, 3, 5}),  is(5));
    }
    @Test
    public void test2(){
        assertThat(solution.solution(5,	new int[]{2, 4},new int[]{3}),  is(4));
    }
    @Test
    public void test4(){
        assertThat(solution.solution(3,	new int[]{2,3},new int[]{1}),  is(2));
    }
    @Test
    public void test5(){
        assertThat(solution.solution(18,	new int[]{7,8,11,12},new int[]{1,6,8,10}),  is(17));
    }
    @Test
    public void test6(){
        assertThat(solution.solution(24,	new int[]{12, 13, 16, 17, 19, 20, 21, 22},new int[]{1,22, 16, 18, 9, 10}),  is(19));
    }
    @Test
    public void test7(){
        //3
        assertThat(solution.solution(5,	new int[]{2, 3, 4},new int[]{1, 3, 5}),  is(5));
    }


}


