package com.algorithm.study.day10;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day10Test {

     private com.algorithm.study.day10.Solution solution = new com.algorithm.study.day10.Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(new String[]{"119", "97674223", "1195524421"}),  is(false));
    }
    @Test
    public void test2(){
        assertThat(solution.solution(new String[]{"123","456","789"}),  is(true));
    }
    @Test
    public void test3(){
        assertThat(solution.solution(new String[]{"12","123","1235","567","88"}),  is(false));
    }
    @Test
    public void test4(){
        assertThat(solution.solution(new String[]{"12232332", "12", "222222"}),  is(false));
    }
    @Test
    public void test5(){
        assertThat(solution.solution(new String[]{"1312332", "12", "222222"}),  is(true));
    }

}


