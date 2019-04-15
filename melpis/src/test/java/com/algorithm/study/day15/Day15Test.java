package com.algorithm.study.day15;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day15Test {

     private Solution solution = new Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(5,24),  is("TUE"));
    }

 @Test
    public void test2(){
        assertThat(solution.solution(1,7 ),  is("THU"));
    }

    @Test
    public void test3(){
        assertThat(solution.solution(1,1 ),  is("FRI"));
    }


}


