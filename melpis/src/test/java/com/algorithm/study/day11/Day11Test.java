package com.algorithm.study.day11;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day11Test {

     private com.algorithm.study.day11.Solution solution = new com.algorithm.study.day11.Solution();


    @Test
    public void test1(){
        assertThat(solution.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}),  is(5));
    }
    @Test
    public void test2(){
        assertThat(solution.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}),  is(3));
    }
    @Test
    public void test3(){
        assertThat(solution.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"},
                {"smoky_makeup", "face1"},{"smoky_makeup_", "face1"},
                {"smoky_makeup", "face2"},{"smoky_makeup_", "face2"}}),  is(26));
    }

}


