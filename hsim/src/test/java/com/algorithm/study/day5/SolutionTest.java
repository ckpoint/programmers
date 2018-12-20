package com.algorithm.study.day5;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_01(){
        Assert.assertEquals(this.solution.solution(3,5), 12);
    }


    @Test
    public void test_02(){
        Assert.assertEquals(this.solution.solution(3,3), 3);
    }


    @Test
    public void test_03(){
        Assert.assertEquals(this.solution.solution(5,3), 12);
    }

    @Test
    public void test_04(){
        Assert.assertEquals(this.solution.solution(1,10), 55);
    }

    @Test
    public void test_05(){
        Assert.assertEquals(this.solution.solution(2,10), 54);
    }

    @Test
    public void test_06(){
        Assert.assertEquals(this.solution.solution(1,11), 66);
    }

    @Test
    public void test_07(){
        Assert.assertEquals(this.solution.solution(7,31), 475);
    }

    @Test
    public void test_08(){
        Assert.assertEquals(this.solution.solution(1001,1002), 2003);
    }

    @Test
    public void test_09(){
        Assert.assertEquals(this.solution.solution(-10,8), IntStream.range(-10, 9).sum());
    }

    @Test
    public void test_10(){
        Assert.assertEquals(this.solution.solution(-10,0), -55);
    }
}
