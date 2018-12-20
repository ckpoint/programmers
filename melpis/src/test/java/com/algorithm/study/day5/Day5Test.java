package com.algorithm.study.day5;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day5Test {

     private SolutionDay5 solution = new SolutionDay5();

    @Test
    public void testEmpty(){
        assertThat(solution.solution2(0,0),  is(0L));
    }

    @Test
    public void test1N1(){
        assertThat(solution.solution2(1,1),  is(1L));
    }
    @Test
    public void test1N2(){
        assertThat(solution.solution2(1,2),  is(3L));
    }
    @Test
    public void test3N5(){
        assertThat(solution.solution2(3,5),  is(12L));
    }
    @Test
    public void test5N3(){
        assertThat(solution.solution2(5,3),  is(12L));
    }
    @Test
    public void testminus5N3(){
        assertThat(solution.solution2(-5,3),  is(-9L));
    }

}


