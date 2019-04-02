package com.algorithm.study.day12;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day12Test {

     private com.algorithm.study.day12.Solution solution = new com.algorithm.study.day12.Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}),  is(new int []{4, 1, 3, 0}));
    }

    @Test
    public void test2(){
        assertThat(solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{800, 600, 800, 800, 2500}),  is(new int []{4, 1, 0, 2}));
    }
}


