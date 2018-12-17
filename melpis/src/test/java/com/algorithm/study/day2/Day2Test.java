package com.algorithm.study.day2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day2Test {
    SolutionDay2 solutionDay2 = new SolutionDay2();

    @Test
    public void testNumber_1(){
        assertThat(solutionDay2.solution(1),  is(1L));
    }

    @Test
    public void testNumber_2(){
        assertThat(solutionDay2.solution(2),  is(2L));
    }
    @Test
    public void testNumber_3(){
        assertThat(solutionDay2.solution(3),  is(4L));
    }

    @Test
    public void testNumber_4(){
        assertThat(solutionDay2.solution(4),  is(11L));
    }
    @Test
    public void testNumber_5(){
        assertThat(solutionDay2.solution(5),  is(12L));
    }
    @Test
    public void testNumber_6(){
        assertThat(solutionDay2.solution(6),  is(14L));
    }

    @Test
    public void testNumber_7(){
        assertThat(solutionDay2.solution(7),  is(21L));
    }
    @Test
    public void testNumber_11(){
        assertThat(solutionDay2.solution(11),  is(42L));
    }
    @Test
    public void testNumber_13(){
        assertThat(solutionDay2.solution(13),  is(111L));
    }

}


