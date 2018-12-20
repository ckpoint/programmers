package com.algorithm.study.day6;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_01(){

        String[] res = this.solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

        Assert.assertEquals(res.length , 4);
        Assert.assertTrue(res[0].equals("Prodo님이 들어왔습니다."));
        Assert.assertTrue(res[1].equals("Ryan님이 들어왔습니다."));
        Assert.assertTrue(res[2].equals("Prodo님이 나갔습니다."));
        Assert.assertTrue(res[3].equals("Prodo님이 들어왔습니다."));
    }

}
