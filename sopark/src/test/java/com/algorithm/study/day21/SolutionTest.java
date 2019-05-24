package com.algorithm.study.day21;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        List<Integer> solution1 = solution.solution(Lists.newArrayList(1, 2, 4, 3), Lists.newArrayList(0, 2));
        assertThat(solution1.toString()).isEqualTo(Lists.newArrayList(2,0).toString());
    }


    @Test
    public void solution2() {
        Solution solution = new Solution();
        List<Integer> solution1 = solution.solution(Lists.newArrayList(1, 2, 3), Lists.newArrayList(1,2,3,4));
        assertThat(solution1.toString()).isEqualTo(Lists.newArrayList(1,0,2,1).toString());
    }


    @Test
    public void solution3() {
        Solution solution = new Solution();
        List<Integer> solution1 = solution.solution(Lists.newArrayList(4, 2, 1, 3), Lists.newArrayList(1, 2,3,4,5));
        assertThat(solution1.toString()).isEqualTo(Lists.newArrayList(3,2,1,0,3).toString());
    }
}
