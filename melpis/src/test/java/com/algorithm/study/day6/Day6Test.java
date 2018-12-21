package com.algorithm.study.day6;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day6Test {

     private SolutionDay6 solution = new SolutionDay6();

    @Test
    public void testEmpty(){
        assertThat(solution.solution(new String[]{}),  is(new String[]{}));
    }

    @Test
    public void testEnter(){
        assertThat(solution.solution(new String[]{"Enter uid1234 Muzi"}),  is(new String[]{"Muzi님이 들어왔습니다."}));
    }

    @Test
    public void testCase(){
        assertThat(solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}),  is(new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."}));
    }

}


