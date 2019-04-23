package com.algorithm.study.day18;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*



2	[Jeju, Pangyo, NewYork, newyork]	16
0	[Jeju, Pangyo, Seoul, NewYork, LA]	25
 */
public class Day18Test {

    private Solution solution = new Solution();


    @Test
    public void test1() {
        assertThat(solution.solution2(3,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), is(50));
    }
    @Test
    public void test2() {
        assertThat(solution.solution2(3,new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"
                }), is(21));
    }
    @Test
    public void test3() {
        assertThat(solution.solution2(2,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}), is(60));

    }
    @Test
    public void test4() {
        assertThat(solution.solution2(5,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}), is(52));

    }
    @Test
    public void test5() {
        assertThat(solution.solution2(2,new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}), is(16));

    }
    @Test
    public void test6() {
        assertThat(solution.solution2(0,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA"}), is(25));

    }
}