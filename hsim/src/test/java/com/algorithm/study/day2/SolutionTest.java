package com.algorithm.study.day2;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void solutionTest_01() {
        //1
        Assert.assertEquals(solution.solution(1), "1");
        //2
        Assert.assertEquals(solution.solution(2), "2");
        //
        Assert.assertEquals(solution.solution(3), "4");
        //10
        Assert.assertEquals(solution.solution(4), "11");  //3 + 1
        //11
        Assert.assertEquals(solution.solution(5), "12"); // 3 +2
        //12
        Assert.assertEquals(solution.solution(6), "14");  // 3 * 2
        //
        Assert.assertEquals(solution.solution(7), "21");  //
        //00001000
        Assert.assertEquals(solution.solution(8), "22");
        //00001001
        Assert.assertEquals(solution.solution(9), "24");
        //00001010
        Assert.assertEquals(solution.solution(10), "41"); // 3 + 3+ 3 + 1
        Assert.assertEquals(solution.solution(11), "42");
        Assert.assertEquals(solution.solution(12), "44");
        Assert.assertEquals(solution.solution(13), "111");
    }
}
