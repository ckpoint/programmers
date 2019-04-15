package com.algorithm.study.day17;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Day17Test {

     private Solution solution = new Solution();


    @Test
    public void test1(){
        Integer a = 9;
        Integer b = 91;
        Integer c = 991;
        System.out.println(a.toString().substring(0,1));
        System.out.println(b.toString().substring(0,1));
        System.out.println(c.toString().substring(0,1));

        assertThat(solution.solution(new int[]{6, 10, 2}),  is("6210"));

    }

    @Test
    public void test2(){
        assertThat(solution.solution(new int[]{3, 30, 34, 5, 9} ),
                is("9534330"));
    }

@Test
    public void test3(){
     assertThat(solution.solution(new int[]{0,0,0,0,0,0,0,0,0,0}),is("0"));
    }


//9, 99 ,98, 991, 1
// 1. 첫째 자리 비교
    // 같지 않다면
// 2. 둘째 자리 비교
// 3. 셋째 자리 비교
}


