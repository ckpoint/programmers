package com.algorithm.study.day4;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day4Test {

     private SolutionDay4 solutionDay4 = new SolutionDay4();

    @Test
    public void testEmpty(){
        assertThat(solutionDay4.solution(0),  is(""));
    }

    @Test
    public void testLength1(){
        assertThat(solutionDay4.solution(1),  is("수"));
    }

    @Test
    public void testLength2(){
        assertThat(solutionDay4.solution(2),  is("수박"));
    }
    @Test
    public void testLength3(){
        assertThat(solutionDay4.solution(3),  is("수박수"));
    }
    @Test
    public void testLength10(){
        assertThat(solutionDay4.solution(10),  is("수박수박수박수박수박"));
    }
}


