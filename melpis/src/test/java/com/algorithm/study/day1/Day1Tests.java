package com.algorithm.study.day1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day1Tests {
    private SolutionDay1 solutionDay1 = new SolutionDay1();

    @Test
    public void test1() {
        assertThat(solutionDay1.solution(new String[]{"test", "test2" }, new String[]{"test" }), is("test2"));
    }

    @Test
    public void test2() {
        assertThat(solutionDay1.solution(new String[]{"mislav", "stanko", "mislav", "ana" }, new String[]{"stanko", "ana", "mislav" }), is("mislav"));
    }

}


