package com.algorithm.study.day1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StudyApplicationTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.solution(new String[]{"test", "test2" }, new String[]{"test" }), is("test2"));
    }

    @Test
    public void test2() {
        assertThat(solution.solution(new String[]{"mislav", "stanko", "mislav", "ana" }, new String[]{"stanko", "ana", "mislav" }), is("mislav"));
    }

}


