package com.algorithm.study.day16;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day16Test {

     private Solution solution = new Solution();


    @Test
    public void test1(){
        assertThat(solution.solution("abcde"),  is("c"));
    }

    @Test
    public void test2(){
        assertThat(solution.solution("qwer" ),  is("we"));
    }



}


